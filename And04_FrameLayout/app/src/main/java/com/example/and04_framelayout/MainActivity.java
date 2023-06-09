package com.example.and04_framelayout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btn_change1 , btn_change2 ;
    //ImageView imgv1 , imgv2 , imgv3;

    ArrayList<ImageView> imgList = new ArrayList<>();//?
    
    int flag = 0; // 어디에서든 사용할수있는 전역변수
    // 현재 객체를 선언만 해둔상태에서는 4개의 객체 모두 null인 상태이다.
    // null이 아니게 하려면 어떤 처리가 필요할까?..

    // null이 아니게 만들고 if문을 이용하여 nullCheck를 하고 log를 찍어보기.
    // nullCheck : btn....imgv3 중 하나라도 null이라면 null이 섞여있음 이라는 로그가 찍힘. 그게 아니라면 전부 초기화 완료 라고 로그에 찍힘.

//    Button btn_change = new Button();



    @Override //main
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // res하위에 있는 모든것들은 "R"이라는 클래스로 하나로 묶인다.

        btn_change1 = findViewById(R.id.btn_change1);
        btn_change2 = findViewById(R.id.btn_change2);

        //ArrayList<E> list.add( E ) ;
        imgList.add( findViewById(R.id.imgv1)) ;
        imgList.add( findViewById(R.id.imgv2)) ;
        imgList.add( findViewById(R.id.imgv3)) ;
        
       // ImageView imgv1 = findViewById(R.id.imgv1);
        //imgList.add(imgv1);
        

        //버튼의 클릭을 감지하는 메소드 . 인터페이스 View.OnClickListner<-
        //1. 직접 인터페이스를 인스턴스화하여 파라메터로 넘기는 방법
//        View.OnClickListener kymOnclick = new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Log.d("버튼", " 버튼이 눌림 ");
//            }
//        };
        // int num = 10 ;  sum(num); == sum(10)
        //2. 인터페이스를 초기화 할수있는 new 생성자로 파라메터를 넘기는 방법
//        btn_change.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Log.d("버튼", " 버튼이 눌림 new ");
//            }
//        });

        //3.방법을 이용해서 onClick메소드를 직접 구현함. 버튼을 누를때마다 밑의 메소드가 실행되게 하려면 어떻게 해야할까?  ↓
        //btn_change.setOnClickListener(new KymEvent());//??


        //onClick(btn_change);

        //4. 자바의 인터페이스 단점을 보완=> lamda (람다식 , 함수형으로 new나 불필요한 코드를 생략하고 사용하는방법)
        // 인터페이스의 abstract메소드가 1개의 경우만 사용가능. ( 인터페이스의 내부 구조를 모르면 사용이 거의 불가능함,초보자 )
//        btn_change.setOnClickListener(v->{ //인터페이스가 주는 파라메터를 (v)써주고 메소드지역을 ->가르킴 { }
//
//        });

        //btn_change.setOnClickListener(this);// 내부적으로 가지고있는 interface가 setter에 의해서 초기화됨.

        btn_change1.setOnClickListener(v->{ //내부적으로 가지고있는 interface가 setter에 의해서 초기화됨.
            flag -- ;
            if(flag == -1){
                flag = 2;
            }
            Log.d("로그", "변수 Flag: " + flag);
            changeImage();
        });



        btn_change2.setOnClickListener(v->{ //내부적으로 가지고있는 interface가 setter에 의해서 초기화됨.
            flag ++ ;
            if(flag == imgList.size()){
                flag = 0;
            }
            Log.d("로그", "변수 Flag: " + flag);
            changeImage();
        });

    }

    // 3. 인터페이스를 상속받는 방법
    // -> Spring MVC의 경우에는 DAO또는 Service가 반드시 구현해야만 하는 메소드의 형태를 만들어서 설계도 개념으로 사용.( 많은 개발자가 협업시 편리한방법)
    // -> Android <- 다형성을 이용한 방법. : View.OnClickLister <= onClick이라는 메소드를 반드시 가지고 있음.
    //                                      View.OnClickLister라는것을 상속받은 Class는 ==ViewOnClickLister와 같다가 성립.

//    public class KymEvent implements View.OnClickListener{
//        @Override
//        public void onClick(View v) {
//            Log.d("버튼", " KymEvent 상속받아서 버튼 눌림을 감지 ");
//        }
//    }

    // java코드를 이용하여 이미지 바꾸기 클릭시 계속해서 이미지가 바뀌게 처리해보기.
    // setVisibility속성을 잘이용할것.
    // hint : 반복은 사용자가 버튼을 클릭하는 행위. ==> 반복문 x
    //        몇번째 누르고있는지를 코드나 변수로 인지를 해야함.
    //  버튼을 누를때마다 로그에 1
    //                              2
    //                                  3
    //                                      1...
    // hint2(다른방법) : setter <> getter? // 은평 , 기곤 , 빛나
    //--------------------------------------------------------------------//
    // ArrayList , arr(배열) , HashMap등으로 풀어보기.
    //
    public void changeImage(){
        for (int i = 0; i < imgList.size(); i++) {
            imgList.get(i).setVisibility(View.GONE);
        }
        imgList.get(flag).setVisibility(View.VISIBLE);
    }




    @Override
    public void onClick(View v) {
        Log.d("버튼", " 인터페이스 상속받아서 버튼 눌림을 감지 " + flag);
        flag ++ ;
    }
}