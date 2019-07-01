package com.technos.mochisrin.gde;

import android.os.Parcel;
import android.os.Parcelable;

public class Gde implements Parcelable {
    private String name, remarks, photo, desc;

    protected Gde(Parcel in) {
        name = in.readString();
        remarks = in.readString();
        photo = in.readString();
        desc = in.readString();
    }

    public static final Creator<Gde> CREATOR = new Creator<Gde>() {
        @Override
        public Gde createFromParcel(Parcel in) {
            return new Gde(in);
        }

        @Override
        public Gde[] newArray(int size) {
            return new Gde[size];
        }
    };

    public Gde() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(name);
        dest.writeString(remarks);
        dest.writeString(photo);
        dest.writeString(desc);
    }
}
