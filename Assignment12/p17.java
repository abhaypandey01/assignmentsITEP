class Test{
    public static void main(String args[]){
        try{
            throw new java.net.ConnectException("Connection failed due to netowrk lost.");
        } catch(java.net.ConnectException e){
            e.printStackTrace();
        }
    }
}