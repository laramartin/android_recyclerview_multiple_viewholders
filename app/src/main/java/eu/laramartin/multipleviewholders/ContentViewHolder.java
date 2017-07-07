package eu.laramartin.multipleviewholders;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

public class ContentViewHolder extends RecyclerView.ViewHolder {

    private final TextView contentText;

    public ContentViewHolder(View itemView) {
        super(itemView);
        contentText = (TextView) itemView.findViewById(R.id.text_content);
    }

    public void bind(Item item) {
        contentText.setText(item.getContent());
    }
}
