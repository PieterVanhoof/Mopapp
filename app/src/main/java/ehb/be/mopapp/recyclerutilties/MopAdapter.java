package ehb.be.mopapp.recyclerutilties;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

import ehb.be.mopapp.R;
import ehb.be.mopapp.model.Mop;

public class MopAdapter extends RecyclerView.Adapter<MopAdapter.mopViewHolder> {

    //viewholder pattern
    //klasse die verwijzingen bijhoud naar elementen in layout
    //klasse enkel hier nodig, -> inner class
    class mopViewHolder extends RecyclerView.ViewHolder{
        //verwijzingen naar elementen in layout
        final TextView tvMop;
        final TextView tvClou;

        public mopViewHolder(@NonNull View itemView) {
            super(itemView);
            tvMop = itemView.findViewById(R.id.tv_mop);
            tvClou = itemView.findViewById(R.id.tv_clou);
        }
    }

    private ArrayList<Mop> items;

    public MopAdapter(ArrayList<Mop> items) {
        this.items = items;
    }


    @NonNull
    @Override
    public mopViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        //viewgroep, waarbinnen wordt alles getekend
        Context context = viewGroup.getContext();
        //binnen context effectief layout omzetten naar iets in het scherm
        View cardRijView = LayoutInflater.from(context).inflate(R.layout.mop_card, viewGroup,false);
        //nieuwe viewholder op basis van de getekende layout
        return new mopViewHolder(cardRijView);
    }
    //rijen opvullen
    @Override
    public void onBindViewHolder(@NonNull mopViewHolder mopViewHolder, int i) {

        Mop mopVoorDeRij = items.get(i);

        mopViewHolder.tvMop.setText( mopVoorDeRij.getMop());
        mopViewHolder.tvClou.setText(mopVoorDeRij.getClou());

    }
    //hoeveel rijen tekenen?
    @Override
    public int getItemCount() {
        return items.size();
    }
}
