import java.util.*;
import java.io.*;

public class stacks {
public static void main(String[] args) {
    Stack<Integer> st = new Stack<>();
    st.push(10);
    st.push(20);
    st.push(30);
    System.out.println(st);
    st.pop();
    System.out.println(st);
}
}
