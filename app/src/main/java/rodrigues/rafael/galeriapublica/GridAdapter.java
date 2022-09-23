package rodrigues.rafael.galeriapublica;

import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.paging.PagingDataAdapter;
import androidx.recyclerview.widget.DiffUtil;

import java.text.SimpleDateFormat;

public class GridAdapter extends PagingDataAdapter<ImageData, ViewHolder> {

    public GridAdapter(@NonNull DiffUtil.ItemCallback<ImageData> diffCallback) {
        super(diffCallback);
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.grid_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        ImageData imageData = getItem(position);

        Bitmap thumb = imageData.thumb;
        ImageView imageView = holder.itemView.findViewById(R.id.imThumb);
        imageView.setImageBitmap(thumb);
    }
}
