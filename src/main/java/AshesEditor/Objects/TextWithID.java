
package AshesEditor.Objects;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class TextWithID {

    @SerializedName("Key")
    private String mKey;
    @SerializedName("Translated String")
    private String mTranslatedString;

    public String getKey() {
        return mKey;
    }

    public void setKey(String Key) {
        mKey = Key;
    }

    public String getTranslatedString() {
        return mTranslatedString;
    }

    public void setTranslatedString(String TranslatedString) {
        mTranslatedString = TranslatedString;
    }

}
