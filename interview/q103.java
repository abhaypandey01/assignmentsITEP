import java.io.*;


class Writting implements Serializable{
    private int id;
    private String name;

    public Writting(int id, String name){
        this.id = id;
        this.name = name;
    }

    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }
}

class Test{
    public static void main(String args[]){
        try{
            File f = new File("employee");
            if(!f.exists() || f.isDirectory()){
                f.createNewFile();
            }

            // Writting writ = new Writting(1, "Arjun");
            // ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(f));
            // oos.writeObject(writ);

            ObjectInputStream oos = new ObjectInputStream(new FileInputStream(f));
            Writting writ = (Writting)(oos.readObject());
            System.out.println("Name: "+writ.getName());
            System.out.println("Id: " + writ.getId());
        } catch(Exception e){}
    }
}