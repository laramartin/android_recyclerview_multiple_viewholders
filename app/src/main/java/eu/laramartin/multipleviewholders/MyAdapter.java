package eu.laramartin.multipleviewholders;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

class MyAdapter extends RecyclerView.Adapter {

    public static final int ITEM_TYPE_TITLE = 0;
    public static final int ITEM_TYPE_CONTENT = 1;
    public static final int ITEM_TYPE_FOOTER = 2;

    List<Item> items = new ArrayList<>();

    public MyAdapter() {
        items.add(Item.createTitle("Title"));
        items.add(Item.createContent("Bacon ipsum dolor amet meatball jowl beef pork chop boudin leberkas tenderloin, shoulder ham hock. Corned beef burgdoggen pork loin filet mignon doner. Chicken rump ham porchetta. Biltong pastrami shank meatball."));
        items.add(Item.createContent("Bacon ipsum dolor amet meatball jowl beef pork chop boudin leberkas tenderloin, shoulder ham hock. Corned beef burgdoggen pork loin filet mignon doner. Chicken rump ham porchetta. Biltong pastrami shank meatball."));
        items.add(Item.createTitle("Title"));
        items.add(Item.createContent("Bacon ipsum dolor amet meatball jowl beef pork chop boudin leberkas tenderloin, shoulder ham hock. Corned beef burgdoggen pork loin filet mignon doner. Chicken rump ham porchetta. Biltong pastrami shank meatball."));
        items.add(Item.createTitle("Title"));
        items.add(Item.createContent("Bacon ipsum dolor amet meatball jowl beef pork chop boudin leberkas tenderloin, shoulder ham hock. Corned beef burgdoggen pork loin filet mignon doner. Chicken rump ham porchetta. Biltong pastrami shank meatball."));
        items.add(Item.createContent("Bacon ipsum dolor amet meatball jowl beef pork chop boudin leberkas tenderloin, shoulder ham hock. Corned beef burgdoggen pork loin filet mignon doner. Chicken rump ham porchetta. Biltong pastrami shank meatball."));
        
        items.add(Item.createContent("Bacon ipsum dolor amet meatball jowl beef pork chop boudin leberkas tenderloin, shoulder ham hock. Corned beef burgdoggen pork loin filet mignon doner. Chicken rump ham porchetta. Biltong pastrami shank meatball."));
        items.add(Item.createFooter());
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        switch (viewType) {
            case ITEM_TYPE_TITLE: {
                View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.view_title_item, parent, false);
                return new TitleViewHolder(view);
            }
            case ITEM_TYPE_CONTENT: {
                View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.view_content_item, parent, false);
                return new ContentViewHolder(view);
            }
            case ITEM_TYPE_FOOTER: {
                View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.view_footer_item, parent, false);
                return new FooterViewHolder(view);
            }
        }
        return null;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        if (holder instanceof TitleViewHolder) {
            ((TitleViewHolder) holder).bind(items.get(position));
        } else if (holder instanceof ContentViewHolder) {
            ((ContentViewHolder) holder).bind(items.get(position));
        } else if (holder instanceof FooterViewHolder) {
            ((FooterViewHolder) holder).bind(items.get(position));
        }
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    @Override
    public int getItemViewType(int position) {
        return items.get(position).getType();
    }
}
