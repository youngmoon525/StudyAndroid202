package com.example.project01_kymtalk.opentalk;

public class OpenSubDTOs {

    public class OpenSub1DTO{
        private int imgTitle , chatPeopleCnt;
        private String roomName , chatTitle , chatDate;

        public OpenSub1DTO(int imgTitle, int chatPeopleCnt, String roomName, String chatTitle, String chatDate) {
            this.imgTitle = imgTitle;
            this.chatPeopleCnt = chatPeopleCnt;
            this.roomName = roomName;
            this.chatTitle = chatTitle;
            this.chatDate = chatDate;
        }

        public int getImgTitle() {
            return imgTitle;
        }

        public void setImgTitle(int imgTitle) {
            this.imgTitle = imgTitle;
        }

        public int getChatPeopleCnt() {
            return chatPeopleCnt;
        }

        public void setChatPeopleCnt(int chatPeopleCnt) {
            this.chatPeopleCnt = chatPeopleCnt;
        }

        public String getRoomName() {
            return roomName;
        }

        public void setRoomName(String roomName) {
            this.roomName = roomName;
        }

        public String getChatTitle() {
            return chatTitle;
        }

        public void setChatTitle(String chatTitle) {
            this.chatTitle = chatTitle;
        }

        public String getChatDate() {
            return chatDate;
        }

        public void setChatDate(String chatDate) {
            this.chatDate = chatDate;
        }
    }

    public class OpenSub2DTO{
        private int imgBackground ;
        private String chatTitle , chatSub;

        public OpenSub2DTO(int imgBackground, String chatTitle, String chatSub) {
            this.imgBackground = imgBackground;
            this.chatTitle = chatTitle;
            this.chatSub = chatSub;
        }

        public int getImgBackground() {
            return imgBackground;
        }

        public void setImgBackground(int imgBackground) {
            this.imgBackground = imgBackground;
        }

        public String getChatTitle() {
            return chatTitle;
        }

        public void setChatTitle(String chatTitle) {
            this.chatTitle = chatTitle;
        }

        public String getChatSub() {
            return chatSub;
        }

        public void setChatSub(String chatSub) {
            this.chatSub = chatSub;
        }
    }

    public class OpenSub3DTO{
        private OpenSub1DTO item1;
        private OpenSub1DTO item2;
        private OpenSub1DTO item3;

        public OpenSub3DTO(OpenSub1DTO item1, OpenSub1DTO item2, OpenSub1DTO item3) {
            this.item1 = item1;
            this.item2 = item2;
            this.item3 = item3;
        }

        public OpenSub1DTO getItem1() {
            return item1;
        }

        public void setItem1(OpenSub1DTO item1) {
            this.item1 = item1;
        }

        public OpenSub1DTO getItem2() {
            return item2;
        }

        public void setItem2(OpenSub1DTO item2) {
            this.item2 = item2;
        }

        public OpenSub1DTO getItem3() {
            return item3;
        }

        public void setItem3(OpenSub1DTO item3) {
            this.item3 = item3;
        }
    }

}
