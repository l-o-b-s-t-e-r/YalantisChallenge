package first.task.yalantis.yalantischallenge;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class RVAdapter extends RecyclerView.Adapter<RVAdapter.PersonViewHolder>{

    private Context mContext;
    private CustomImageView[] mCustomImageView;

    public RVAdapter(CustomImageView[] customImageViews, Context context){
        this.mCustomImageView = customImageViews;
        this.mContext = context;
    }

    @Override
    public int getItemCount() {
        return mCustomImageView.length;
    }

    @Override
    public PersonViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.card_captioned_image, parent, false);

        return new PersonViewHolder(view);
    }

    @Override
    public void onBindViewHolder(PersonViewHolder holder, int position){
        Picasso.with(mContext).load(mCustomImageView[position].getFirstImageId()).into(holder.mFirstImage);
        Picasso.with(mContext).load(mCustomImageView[position].getSecondImageId()).into(holder.mSecondImage);
    }

    public class PersonViewHolder extends RecyclerView.ViewHolder {

        private ImageView mFirstImage;
        private ImageView mSecondImage;

        PersonViewHolder(View view) {
            super(view);
            this.mFirstImage = (ImageView)view.findViewById(R.id.info_image1);
            this.mSecondImage = (ImageView)view.findViewById(R.id.info_image2);
        }
    }
}
