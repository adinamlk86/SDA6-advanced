package generics;

public class MyClass<T>{

  T data;
  T info;

    public MyClass(T data, T info) {
        this.data = data;
        this.info = info;
    }

    @Override
    public String toString() {
        return "MyClass{" +
                "data=" + data +
                ", info=" + info +
                '}';
    }
}