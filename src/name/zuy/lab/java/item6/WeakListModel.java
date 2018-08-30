package name.zuy.lab.java.item6;

import javax.swing.*;
import javax.swing.event.ListDataEvent;
import javax.swing.event.ListDataListener;
import java.io.Serializable;
import java.util.*;

public class WeakListModel implements ListModel, Serializable {

    private Map<ListDataListener, Object> listenerList = Collections.synchronizedMap(new WeakHashMap<>());
    private final Object present = new Object();
    private ArrayList<Object> delegate = new ArrayList<>();

    @Override
    public int getSize() {
        return delegate.size();
    }

    public void trimToSize() {
        delegate.trimToSize();
    }

    public void ensureCapacity(int minCapacity) {
        delegate.ensureCapacity(minCapacity);
    }

    public int size() {
        return delegate.size();
    }

    public boolean isEmpty() {
        return delegate.isEmpty();
    }

    public Enumeration elements() {
        return Collections.enumeration(delegate);
    }

    public boolean contains(Object elem) {
        return delegate.contains(elem);
    }

    public int indexOf(Object elem) {
        return delegate.indexOf(elem);
    }

    public int lastIndexOf(Object elem) {
        return delegate.lastIndexOf(elem);
    }

    public Object elementAt(int index) {
        return delegate.get(index);
    }

    public Object firstElement() {
        return delegate.get(0);
    }

    public Object lastElement() {
        return delegate.get(delegate.size()-1);
    }

    public String toString() {
        return delegate.toString();
    }

    @Override
    public Object getElementAt(int index) {
        return delegate.get(index);
    }

    @Override
    public synchronized void addListDataListener(ListDataListener l) {
        listenerList.put(l, present);
    }

    @Override
    public synchronized void removeListDataListener(ListDataListener l) {
        listenerList.remove(l);
    }

    public EventListener[] getListeners(Class listenerType) {
        Set<ListDataListener> set = listenerList.keySet();
        return set.toArray(new EventListener[0]);
    }

    public void setElementAt(Object obj, int index) {
        delegate.set(index, obj);
        fireContentsChanged(this, index, index);
    }

    public void removeElementAt(int index) {
        delegate.remove(index);
        fireIntervalRemoved(this, index, index);
    }

    public void insertElementAt(Object obj, int index) {
        delegate.add(index, obj);
        fireIntervalAdded(this, index, index);
    }

    public void addElement(Object obj) {
        int index = delegate.size();
        delegate.add(obj);
        fireIntervalAdded(this, index, index);
    }

    public boolean removeElement(Object obj) {
        int index = indexOf(obj);
        boolean rv = delegate.remove(obj);
        if (index >= 0) {
            fireIntervalRemoved(this, index, index);
        }
        return rv;
    }

    public void removeAllElements() {
        int index1 = delegate.size()-1;
        delegate.clear();
        if (index1 >= 0) {
            fireIntervalRemoved(this, 0, index1);
        }
    }

    protected synchronized void fireContentsChanged(
            Object source, int index0, int index1) {
        ListDataEvent e = null;

        Set<ListDataListener> set =
                new HashSet<ListDataListener>(listenerList.keySet());
        Iterator<ListDataListener> iter = set.iterator();

        while (iter.hasNext()) {
            if (e == null) {
                e = new ListDataEvent(
                        source, ListDataEvent.CONTENTS_CHANGED,
                        index0, index1);
            }
            ListDataListener ldl = iter.next();
            ldl.contentsChanged(e);
        }
    }

    protected synchronized void fireIntervalAdded(
            Object source, int index0, int index1) {
        ListDataEvent e = null;

        Set<ListDataListener> set =
                new HashSet<ListDataListener>(listenerList.keySet());
        Iterator<ListDataListener> iter = set.iterator();

        while (iter.hasNext()) {
            if (e == null) {
                e = new ListDataEvent(
                        source, ListDataEvent.INTERVAL_ADDED,
                        index0, index1);
            }
            ListDataListener ldl = iter.next();
            ldl.intervalAdded(e);
        }
    }

    protected synchronized void fireIntervalRemoved(
            Object source, int index0, int index1) {
        ListDataEvent e = null;

        Set<ListDataListener> set =
                new HashSet<ListDataListener>(listenerList.keySet());

        Iterator<ListDataListener> iter = set.iterator();

        while (iter.hasNext()) {
            if (e == null) {
                e = new ListDataEvent(
                        source, ListDataEvent.INTERVAL_REMOVED,
                        index0, index1);
            }
            ListDataListener ldl = iter.next();
            ldl.intervalRemoved(e);
        }
    }
}
