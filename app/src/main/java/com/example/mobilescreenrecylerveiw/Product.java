package com.example.mobilescreenrecylerveiw;

public class Product {
    private String title1;
    private String title2;
    private String title3;
    private String title4;

    private int image1;
    private int image2;
    private int image3;
    private int image4;

    public Product(String title1,String title2,String title3,String title4,int image1, int image2,int image3,int image4) {

        this.title1 = title1;
        this.image1 = image1;
        this.title2 = title2;
        this.image2 = image2;
        this.title3 = title3;
        this.image3 = image3;
        this.title4 = title4;
        this.image4 = image4;

    }


            public String getTitle1(){
            return title1;
        }
    public String getTitle2(){
        return title2;
    }
    public String getTitle3(){
        return title3;
    }
    public String getTitle4(){
        return title4;
    }



        public int getImage1(){
        return image1;
    }
    public int getImage2(){
        return image2;
    }
    public int getImage3(){
        return image3;
    }
    public int getImage4(){
        return image4;
    }



    }

