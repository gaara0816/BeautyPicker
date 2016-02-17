package sh.demon.beautypicker.bean;

import android.text.TextUtils;

import java.util.List;

/**
 * Created by zhangbo on 16/2/12.
 */
public class Folder {

    public String name;
    public String path;
    public Image cover;
    public List<Image> images;

    @Override
    public boolean equals(Object o) {
        try {
            Folder other = (Folder) o;
            return TextUtils.equals(other.path, path);
        }catch (ClassCastException e){
            e.printStackTrace();
        }
        return super.equals(o);
    }
}
