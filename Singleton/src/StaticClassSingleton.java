public class StaticClassSingleton {
    private StaticClassSingleton(){}

    public static StaticClassSingleton getInstance(){
        return SingletonInner.INSTANCE;
    }

    private static class SingletonInner{
        private final static StaticClassSingleton INSTANCE = new StaticClassSingleton();
    }
}
