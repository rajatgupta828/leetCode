public class Array101 {

    public String name;
    public String releaseYear;
    public String director;

    public Array101(String name, String releaseYear, String director){
        this.name = name;
        this.releaseYear = releaseYear;
        this.director = director;
    }

    public  Array101(){

    }

    public static void main(String[] args) {
        Array101[] dvdcollection = new Array101[8];
        String[] names = {"Name1", "Name2" , "Name 3", "Name4", "Name5", "Name6" , "Name 7", "Name8"};
        String[] yoR = {"2001", "2002","2003","2004","2005","2006","2007","2008"};
        String[] dirc = {"rajat","rajat","rajat","rajat","rajat","rajat","rajat","rajat"};

        for(int j = 0; j < 8; j++){
            Array101 arrElem = new Array101(names[j],yoR[j],dirc[j]);
            dvdcollection[j] = arrElem;
        }

        for (int i = 0 ; i < dvdcollection.length ; i++){
            System.out.println("Array Element  : " + i + " name :" + dvdcollection[i].name + " Directed By" +
                    dvdcollection[i].director + " Release Year : " + dvdcollection[i].releaseYear);
        }
    }

}