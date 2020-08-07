package com.example.klubliga1;


import android.os.Parcel;
import android.os.Parcelable;

public class Klub implements Parcelable {
    private String name;
    private String detail;
    private int photo;
    private int stadion;
    private String berdiri;
    private String manajer;
    private String basis;
    private String namastadion;

    public Klub() {

    }

    public String getBerdiri() { return berdiri; }

    public void setBerdiri(String berdiri) { this.berdiri = berdiri; }

    public String getManajer() { return manajer; }

    public void setManajer(String manajer) { this.manajer = manajer; }

    public String getBasis() { return basis; }

    public void setBasis(String basis) { this.basis = basis; }

    public String getNamastadion() { return namastadion; }

    public void setNamastadion(String namastadion) { this.namastadion = namastadion; }

    public int getStadion() {
        return stadion;
    }

    public void setStadion(int stadion) { this.stadion = stadion; }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name);
        parcel.writeString(detail);
        parcel.writeInt(photo);
        parcel.writeInt(stadion);
        parcel.writeString(berdiri);
        parcel.writeString(manajer);
        parcel.writeString(basis);
        parcel.writeString(namastadion);
    }

    protected Klub(Parcel in) {
        name = in.readString();
        detail = in.readString();
        photo = in.readInt();
        stadion = in.readInt();
        berdiri = in.readString();
        manajer = in.readString();
        basis = in.readString();
        namastadion = in.readString();
    }

    public static final Creator<Klub> CREATOR = new Creator<Klub>() {
        @Override
        public Klub createFromParcel(Parcel in) {
            return new Klub(in);
        }

        @Override
        public Klub[] newArray(int size) {
            return new Klub[size];
        }
    };

}
