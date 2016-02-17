package sh.demon.beautypicker.adapter;

import android.content.Context;
import android.media.Image;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;

import sh.demon.beautypicker.R;

/**
 * Created by zhangbo on 16/2/9.
 */
public class PickerAdapter extends RecyclerView.Adapter<PickerAdapter.ViewHolder> {

    private static final int TYPE_CAMERA = 0;
    private static final int TYPE_NORMAL = 1;

    private Context mContext;
    private List<Image> mImages = new ArrayList<>();
    private List<Image> mSelectedImages = new ArrayList<>();

    private boolean mShowCamera;
    private LayoutInflater mInflater;

    public PickerAdapter(Context context) {
        mContext = context;
        mInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    public void setDatas(){

    }

    @Override
    public PickerAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view;
        if(viewType == TYPE_CAMERA){
            view = mInflater.inflate(R.layout.item_camera,parent,false);
        }else {
            view = mInflater.inflate(R.layout.item_image,parent,false);
        }
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(PickerAdapter.ViewHolder holder, int position) {
        int viewType = getItemViewType(position);
        switch (viewType){
            case TYPE_CAMERA:
                break;
            case TYPE_NORMAL:
                break;
        }
    }

    @Override
    public int getItemCount() {
        return mShowCamera ? mImages.size() + 1:mImages.size();
    }

    @Override
    public int getItemViewType(int position) {
        if(mShowCamera){
            return position == 0 ? TYPE_CAMERA : TYPE_NORMAL;
        }
        return TYPE_NORMAL;
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

        ImageView checkImage;

        public ViewHolder(View itemView) {
            super(itemView);
            checkImage = (ImageView) itemView.findViewById(R.id.checkmark);
        }

        @Override
        public void onClick(View v) {

        }
    }
}
