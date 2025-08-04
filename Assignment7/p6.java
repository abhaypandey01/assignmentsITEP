/*
Movie Rating System
Create a class Movie with fields: name, genre, and rating.
Use setters and create a method isHit() that returns true if rating ≥ 8.0.
 */
class Movie{
    private String name;
    private String genre;
    private double rating;

    public void setName(String name){
        this.name = name;
    }

    public void setGenre(String genre){
        this.genre = genre;
    }

    public void setRating(double rating){
        this.rating = rating;
    }

    public boolean isHit(){
        if(rating >= 8.0)
        return true;
        return false;
    }
}


class Test{
    public static void main(String args[]){
        Movie obj = new Movie();
        obj.setName("Mahavtar Narsimha");
        obj.setGenre("Mythology");
        obj.setRating(8.9);

        boolean hit = obj.isHit();

        System.out.println("Movie hit : " + hit);
    }
}