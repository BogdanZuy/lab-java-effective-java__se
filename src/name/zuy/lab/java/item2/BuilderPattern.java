package name.zuy.lab.java.item2;

public class BuilderPattern {

    private int some1 = -1;
    private int some2 = -1;
    private int some3 = 0;
    private int some4 = 0;
    private int some5 = 0;
    private int someN = 0;

    public static void info() {
        System.out.println("Use Builder pattern\n" +
                " BuilderPattern builderPattern = new Builder(1,2).some3(3).someN(100).build();\n" +
                "The Builder pattern simulates named optional parameters as found in Ada and Python.\n" +
                "The Builder pattern is a good choice when designing classes whose constructors or static factories would have more than a handful of parameters.");
    }

        // Telescoping constructor pattern
    public BuilderPattern(int some1) {
        this(some1, 0, 0, 0, 0, 0);
    }

    public BuilderPattern(int some1, int some2) {
        this(some1, some2, 0, 0, 0, 0);
    }

    public BuilderPattern(int some1, int some2, int some3) {
        this(some1, some2, some3, 0, 0, 0);
    }

    public BuilderPattern(int some1, int some2, int some3, int some4) {
        this(some1, some2, some3, some4, 0, 0);
    }

    public BuilderPattern(int some1, int some2, int some3, int some4, int some5) {
        this(some1, some2, some3, some4, some5, 0);
    }

    public BuilderPattern(int some1, int some2, int some3, int some4, int some5, int someN) {
        this.some1 = some1;
        this.some2 = some2;
        this.some3 = some3;
        this.some4 = some4;
        this.some5 = some5;
        this.someN = someN;
    }


    // JavaBeans pattern
    public BuilderPattern() {
    }

    public void setSome1(int some1) {
        this.some1 = some1;
    }

    public void setSome2(int some2) {
        this.some2 = some2;
    }

    public void setSome3(int some3) {
        this.some3 = some3;
    }

    public void setSome4(int some4) {
        this.some4 = some4;
    }

    public void setSome5(int some5) {
        this.some5 = some5;
    }

    public void setSomeN(int someN) {
        this.someN = someN;
    }

    // Builder pattern
    private BuilderPattern(Builder builder) {
        this.some1 = builder.some1;
        this.some2 = builder.some2;
        this.some3 = builder.some3;
        this.some4 = builder.some4;
        this.some5 = builder.some5;
        this.someN = builder.someN;
    }

    public static class Builder implements name.zuy.lab.java.item2.Builder<BuilderPattern> {
        private int some1;
        private int some2;
        private int some3 = 0;
        private int some4 = 0;
        private int some5 = 0;
        private int someN = 0;

        public Builder(int some1, int some2) {
            this.some1 = some1;
            this.some2 = some2;
        }

        public Builder some3(int val) {
            this.some3 = val; return this;
        }

        public Builder some4(int val) {
            this.some4 = val; return this;
        }

        public Builder some5(int val) {
            this.some5 = val; return this;
        }

        public Builder someN(int val) {
            this.someN = val; return this;
        }

        public BuilderPattern build() {
            return new BuilderPattern(this);
        }

    }

    public static BuilderPattern sample() {
        BuilderPattern builderPattern = new Builder(1,2).some3(3).someN(100).build();
        return builderPattern;
    }

}
