package com.example.lenovo.seller.list;

public class applicationDetailsList  {

        int img;
        String title,price,quantity;

        public applicationDetailsList(int img, String title, String price,String quantity) {
            this.img = img;
            this.title = title;
            this.price = price;
            this.quantity=quantity;
        }

        public int getImg() {
            return img;
        }

        public void setImg(int img) {
            this.img = img;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getPrice() {
            return price;
        }

        public void setPrice(String price) {
            this.price = price;
        }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }
}


