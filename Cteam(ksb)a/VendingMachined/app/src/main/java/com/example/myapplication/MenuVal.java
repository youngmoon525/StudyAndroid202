package com.example.myapplication;

import java.util.ArrayList;

public class MenuVal {
        public static String[]names= {
                "아몬드","초록 사과","사과","황금 사과","아스파라거스","아보카도","베이컨",
                "베이글","바게트","바나나","파프리카","녹색 파프리카","노란 파프리카","블루베리",
                "갈색 식빵","식빵","뿌링클 치킨"
        };
        public static String[]explains={
                "맛있는 아몬드","맛있는 초록 사과","맛있는 사과","맛있는 황금 사과","맛있는 아스파라거스","맛있는 아보카도",
                "맛있는 베이컨","맛있는 베이글","맛있는 바게트","맛있는 바나나","맛있는 파프리카","맛있는 녹색 파프리카",
                "노란 파프리카","맛있는 블루베리","맛있는 갈색 식빵","맛있는 식빵","과거부터 현재까지 전 국민.. 아니 전 세계의 식욕을 불러일으켰던 마의 음식이다. 현재 합법적으로 섭취할 수 있는 유일한 마약이다."
        };
        public static String[]types={
                "견과류","과일","과일","과일","채소","과일","육류","제과류","제과류","과일","채소","채소","채소","과일","제과류","제과류","음식"
        };
        public static int[]prices={
                500,1500,1500,1500,200,
                250,2200,2500,2500,1500,
                400,400,400,500,500,
                500,50000
        };
        public static int[]amounts={
                30,60,45,40,150,
                10,130,60,60,130,
                130,130,130,50,30,
                30,100
        };
    public static int[]src={

            R.drawable.almonds,
            R.drawable.apple_green,
            R.drawable.apple_red,
            R.drawable.apple_yellow,
            R.drawable.asparagus,
            R.drawable.avocado_half,
            R.drawable.bacon,
            R.drawable.bagel,
            R.drawable.baguette,
            R.drawable.banana,
            R.drawable.bell_pepper_red,
            R.drawable.bell_pepper_green,
            R.drawable.bell_pepper_yellow,
            R.drawable.blueberries,
            R.drawable.bread_loaf_brown,
            R.drawable.bread_loaf_white,
            R.drawable.chicken_drumstick_raw
    };


//    public void baseList(){
//        //이름, 정보,종류,가격,수량,src
//        menuList.add(new MenuDTO("아몬드","맛있는 아몬드","견과류",500,30,"@drawable/almonds"));
//        menuList.add(new MenuDTO("초록 사과","맛있는 초록 사과","과일",1500,60,"@drawable/apple_green"));
//        menuList.add(new MenuDTO("사과","맛있는 사과","과일",1500,45,"@drawable/apple_red"));
//        menuList.add(new MenuDTO("황금 사과","맛있는 황금 사과","과일",1500,40,"@drawable/apple_yellow"));
//        menuList.add(new MenuDTO("아스파라거스","맛있는 아스파라거스","채소",200,150,"@drawable/asparagus"));
//        menuList.add(new MenuDTO("아보카도","맛있는 아보카도","과일",250,10,"@drawable/avocado_half"));
//        menuList.add(new MenuDTO("베이컨","맛있는 베이컨","육류",2200,130,"@drawable/bacon"));
//        menuList.add(new MenuDTO("베이글","맛있는 베이글","제과류",2500,60,"@drawable/bagel"));
//        menuList.add(new MenuDTO("바게트","맛있는 바게트","제과류",2500,60,"@drawable/baguette"));
//        menuList.add(new MenuDTO("바나나","맛있는 바나나","과일",1500,130,"@drawable/banana"));
//        menuList.add(new MenuDTO("파프리카","맛있는 파프리카","채소",400,130,"@drawable/bell_pepper_red"));
//        menuList.add(new MenuDTO("녹색 파프리카","맛있는 녹색 파프리카","채소",400,130,"@drawable/bell_pepper_green"));
//        //아 귀찮아ㅏㅏㅏ
//        menuList.add(new MenuDTO("노란 파프리카","노란 파프리카","채소",400,130,"@drawable/bell_pepper_yellow"));
//        menuList.add(new MenuDTO("블루베리","맛있는 블루베리","과일",500,50,"@drawable/blueberries"));
//        menuList.add(new MenuDTO("갈색 식빵","맛있는 갈색 식빵","제과류",500,30,"@drawable/bread_loaf_brown"));
//        menuList.add(new MenuDTO("식빵","맛있는 식빵","제과류",500,30,"@drawable/bread_loaf_white"));
//        menuList.add(new MenuDTO("뿌링클 치킨","과거부터 현재까지 전 국민.. 아니 전 세계의 식욕을 불러일으켰던 마의 음식이다. 현재 합법적으로 섭취할 수 있는 유일한 마약이다.","치킨",500000,100,"@drawable/chicken_drumstick_raw"));
//    }

}
