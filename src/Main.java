
public class Main {

	public static void main(String[] args) {

		Stack st = new Stack();
		st.push(13);
		st.push(4);
		st.push(5);
		st.push(6);
		st.push(7);
		st.push(8);
		System.out.println(st.pop());
		st.push("sbjhvbsdjvb");
		System.out.println(st.pop());
		System.out.println(st.pop());
		System.out.println(st.pop());
		System.out.println(st.pop());
		st.clear();
		System.out.println(st.pop());
		st.push(8);
		System.out.println(st.pop());
	}

}
