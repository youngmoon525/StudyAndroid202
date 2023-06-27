package com.example.project01_kymtalk.opentalk;

import com.example.project01_kymtalk.R;

import java.util.ArrayList;

public class OpenSubDAO {

    public ArrayList<OpenSubDTOs.OpenSub1DTO> getOpenSub1List(){
        ArrayList<OpenSubDTOs.OpenSub1DTO> list = new ArrayList<>();
        list.add(new OpenSubDTOs().new OpenSub1DTO(R.drawable.friend_img1, 1288 , "광주 재미있는 모임","지금 뭐하세요?","오후 4:01"));
        list.add(new OpenSubDTOs().new OpenSub1DTO(R.drawable.friend_img2, 75 , "개발자 커뮤니티 ","안드로이드 쉬움?","오후 4:08"));
        list.add(new OpenSubDTOs().new OpenSub1DTO(R.drawable.friend_img3, 0 , "익명 상담방","","6월 10일"));
        return list;
    }

    public ArrayList<OpenSubDTOs.OpenSub2DTO> getOpenSub2List(int flag){
        ArrayList<OpenSubDTOs.OpenSub2DTO> list = new ArrayList<>();
        if(flag==1){
        list.add(new OpenSubDTOs().new OpenSub2DTO(R.drawable.profile_img1,  "고독한 빌리","140명"));
        list.add(new OpenSubDTOs().new OpenSub2DTO(R.drawable.profile_img2,  "😊고독한 세븐틴짤😊","83명 | 방금 대화"));
        list.add(new OpenSubDTOs().new OpenSub2DTO(R.drawable.profile_img3,  "안고독한 석매튜 제로베이스...","5554명 | 방금대화"));
        list.add(new OpenSubDTOs().new OpenSub2DTO(R.drawable.profile_img4,  "안고독한 안효섭","173"));
        }else if(flag==2){
            list.add(new OpenSubDTOs().new OpenSub2DTO(R.drawable.profile_img5,  "짤로 대화하기","11명"));
            list.add(new OpenSubDTOs().new OpenSub2DTO(R.drawable.profile_img6,  "웃긴짤 배틀","83명 | 방금 대화"));
            list.add(new OpenSubDTOs().new OpenSub2DTO(R.drawable.profile_img7,  "👌짤로만 대화 하기 연습","5554명 | 방금대화"));
        }else if(flag==3){
            list.add(new OpenSubDTOs().new OpenSub2DTO(R.drawable.profile_img8,  "노원,도봉,강북 지역 배달음식...","11명"));
            list.add(new OpenSubDTOs().new OpenSub2DTO(android.R.drawable.screen_background_light,  "관악우성 배달음식\n 같이 시켜먹..","83명 | 방금 대화"));
            list.add(new OpenSubDTOs().new OpenSub2DTO(R.drawable.profile_img2,  "쌍촌동 먹을거먹자","5554명 | 방금대화"));
        }
        return list;
    }

    public ArrayList<OpenSubDTOs.OpenSub3DTO> getOpenSub3List(int flag){
        ArrayList<OpenSubDTOs.OpenSub3DTO> list = new ArrayList<>();
        if(flag==1){
            list.add(new OpenSubDTOs().new OpenSub3DTO(
                    new OpenSubDTOs().new OpenSub1DTO(R.drawable.friend_img1, 19 , "2023 앵무새 모임","",""),
                    new OpenSubDTOs().new OpenSub1DTO(R.drawable.friend_img2, 30 , "우리 앵무새는요😊","",""),
                    new OpenSubDTOs().new OpenSub1DTO(R.drawable.friend_img3, 100 , "앵무새정보공유방 2기"," ","")));
            list.add(new OpenSubDTOs().new OpenSub3DTO(
                    new OpenSubDTOs().new OpenSub1DTO(R.drawable.friend_img4, 19 , "공유해요 동물의 짤","",""),
                    new OpenSubDTOs().new OpenSub1DTO(R.drawable.friend_img5, 30 , "고양이 자랑방","",""),
                    new OpenSubDTOs().new OpenSub1DTO(R.drawable.friend_img6, 100 , "귀여운 것들을 보내는방","","")));


        } else  if(flag==2){
            list.add(new OpenSubDTOs().new OpenSub3DTO(
                    new OpenSubDTOs().new OpenSub1DTO(R.drawable.profile_img1, 19 , "2023 앵무새 모임","",""),
                    new OpenSubDTOs().new OpenSub1DTO(R.drawable.profile_img2, 30 , "우리 앵무새는요😊","",""),
                    new OpenSubDTOs().new OpenSub1DTO(R.drawable.profile_img3, 100 , "앵무새정보공유방 2기"," ","")));
            list.add(new OpenSubDTOs().new OpenSub3DTO(
                    new OpenSubDTOs().new OpenSub1DTO(R.drawable.profile_img4, 19 , "공유해요 동물의 짤","",""),
                    new OpenSubDTOs().new OpenSub1DTO(R.drawable.profile_img5, 30 , "고양이 자랑방","",""),
                    new OpenSubDTOs().new OpenSub1DTO(R.drawable.profile_img6, 100 , "귀여운 것들을 보내는방","","")));


        }
        return list;
    }
}
