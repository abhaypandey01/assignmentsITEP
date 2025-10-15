class Test{
    public static void main(String args[]){
        String s1 = "Hello";
        String s="Hello";
        System.out.println(s.hashCode());
        System.out.println(s1.hashCode());
        String s2 = new String("World");
        String si=new String("World");
        System.out.println(s2.hashCode());
        System.out.println(si.hashCode());
        System.out.println(s2==si);

        StringBuffer sb = new StringBuffer();
        sb.append("Hello");
        sb.append(" world");
        StringBuilder st = new StringBuilder();
        st.append("Hello");
        st.append(" java");

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(sb);
        System.out.println(st);



    }
}