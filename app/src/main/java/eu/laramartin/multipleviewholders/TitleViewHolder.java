package eu.laramartin.multipleviewholders;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

public class TitleViewHolder extends RecyclerView.ViewHolder {

    public TitleViewHolder(View itemView) {
        super(itemView);
    }

    public void bind(Item item) {
        ((TextView) itemView).setText(item.getTitle());
    }
}
