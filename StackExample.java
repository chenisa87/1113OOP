
class MyStack<T> {

    public MyStack() {
    }

    public void push(T item) {
    }

    public T pop() {
        return stack.top();
    }

    // 检查栈是否为空
    public boolean isEmpty() {
        return stack.isEmpty();
    }

    // 返回栈中的元素数量
    public int size() {
        return stack.size();
    }
}

public class StackExample{
    public static void main(String[] args) {
        MyStack<Integer> stack = new MyStack<>();
        //do some test if needed
    }
}



//我的Junit測試會測這個Object，這邊以下請不要修改
//---------------------------------------------------------------------------------
class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + "}";
    }
}
//---------------------------------------------------------------------------------