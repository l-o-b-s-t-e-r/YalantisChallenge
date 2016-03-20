package first.task.yalantis.yalantischallenge;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class RVAdapter extends RecyclerView.Adapter<RVAdapter.PersonViewHolder>{

    private Context context;
    private CustomCard[] customCards;

    public RVAdapter(CustomCard[] customCards, Context context){
        this.customCards = customCards;
        this.context = context;
    }

    @Override
    public int getItemCount() {
        return customCards.length;
    }

    @Override
    public PersonViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        CardView cardView = (CardView) LayoutInflater.from(parent.getContext())
                .inflate(R.layout.card_captioned_image, parent, false);

        return new PersonViewHolder(cardView);
    }

    @Override
    public void onBindViewHolder(PersonViewHolder holder, int position){
        CardView cardView = holder.cardView;
        ImageView imageView = (ImageView)cardView.findViewById(R.id.info_image1);
        Picasso.with(context).load(customCards[position].getFirstImageId()).into(imageView);

        imageView = (ImageView)cardView.findViewById(R.id.info_image2);
        Picasso.with(context).load(customCards[position].getSecondImageId()).into(imageView);
    }

    public class PersonViewHolder extends RecyclerView.ViewHolder {

        private CardView cardView;

        PersonViewHolder(CardView cardView) {
            super(cardView);
            this.cardView = cardView;
        }
    }
}
