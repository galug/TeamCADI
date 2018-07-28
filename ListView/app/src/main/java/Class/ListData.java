package Class;

import android.graphics.drawable.Drawable;
import android.provider.ContactsContract;

public class ListData
{
    private Drawable mProfile;
    private String mNickName;
    private String mDate;
    private String mText;

    public Drawable getmProfile() {
        return mProfile;
    }

    public void setmProfile(Drawable mProfile) {
        this.mProfile = mProfile;
    }

    public String getmNickName() {
        return mNickName;
    }

    public void setmNickName(String mNickName) {
        this.mNickName = mNickName;
    }

    public String getmDate() {
        return mDate;
    }

    public void setmDate(String mDate) {
        this.mDate = mDate;
    }

    public String getmText() {
        return mText;
    }

    public void setmText(String mText) {
        this.mText = mText;
    }
}
