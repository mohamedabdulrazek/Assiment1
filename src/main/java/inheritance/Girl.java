package inheritance;

public class Girl extends Person  {
    private String favoriteMove;

    public Girl(double heigh, String grade, String email, String name, int age, String favoriteMove) {
        super(heigh, grade, email, name, age);
        this.favoriteMove = favoriteMove;
    }

public Girl (){

}
    public void SetFavoriteMove (String favoritemove) {
        this.favoriteMove=favoriteMove;
    }

    public String getFavoriteMove (){
        return favoriteMove;
    }


    public Girl(String favoriteMove) {
        this.favoriteMove = favoriteMove;
    }
}
