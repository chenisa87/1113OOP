import java.util.ArrayList;
import java.util.List;

class MyStack<T> {
    private List<T> stack; // 用 List 來存放元素

    public MyStack() {
        stack = new ArrayList<>();
    }

    // push: 把新元素放到最上面
    public void push(T item) {
        stack.add(item);
    }

    // pop: 移除並返回最上面的元素
    public T pop() {
        if (stack.isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return stack.remove(stack.size() - 1);
    }

    // 查看最上面（但不移除）的元素
    public T top() {
        if (stack.isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return stack.get(stack.size() - 1);
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

public class StackExample {
    public static void main(String[] args) {
        MyStack<Integer> stack = new MyStack<>();
        stack.push(10);
        stack.push(20);
        System.out.println("Top: " + stack.top());  // Top: 20
        System.out.println("Pop: " + stack.pop());  // Pop: 20
        System.out.println("Size: " + stack.size()); // Size: 1

        MyStack<Person> people = new MyStack<>();
        people.push(new Person("Alice", 25));
        people.push(new Person("Bob", 30));
        System.out.println("Pop person: " + people.pop());
    }
}


// 以下請不要修改
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
