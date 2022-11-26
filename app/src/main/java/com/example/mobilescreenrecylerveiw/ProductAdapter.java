package com.example.mobilescreenrecylerveiw;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;


public class ProductAdapter extends RecyclerView.Adapter<ProductAdapter.ProductViewHolder> {



    private Context mCtx;


    private ArrayList<Object> productList;


    public ProductAdapter(Context mCtx, ArrayList<Object> productList) {
        this.mCtx = mCtx;
        this.productList = productList;
    }

    @Override
    public ProductViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        LayoutInflater inflater = LayoutInflater.from(mCtx);
        View view = inflater.inflate(R.layout.layout_products, null);
        return new ProductViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ProductViewHolder holder, int position) {

        Product product = (Product) productList.get(position);

        holder.tv1.setText(product.getTitle1());
        holder.tv2.setText(product.getTitle2());
        holder.tv3.setText(product.getTitle3());
        holder.tv4.setText(product.getTitle4());
        holder.imageView.setImageDrawable(mCtx.getResources().getDrawable(product.getImage1()));
        holder.imageView2.setImageDrawable(mCtx.getResources().getDrawable(product.getImage2()));
        holder.imageView3.setImageDrawable(mCtx.getResources().getDrawable(product.getImage3()));
        holder.imageView4.setImageDrawable(mCtx.getResources().getDrawable(product.getImage4()));
    }


    @Override
    public int getItemCount() {
        return productList.size();
    }


    class ProductViewHolder extends RecyclerView.ViewHolder {

        TextView tv1, tv2,tv3 ,tv4 ;
        ImageView imageView, imageView2,imageView3,imageView4;

        public ProductViewHolder(View itemView) {
            super(itemView);

            tv1 = itemView.findViewById(R.id.item_name);
            tv2 = itemView.findViewById(R.id.item_name2);
            tv3 = itemView.findViewById(R.id.item_name3);
            tv4 = itemView.findViewById(R.id.item_name4);

            imageView = itemView.findViewById(R.id.grid_image);
            imageView2 = itemView.findViewById(R.id.grid_image2);
            imageView3 = itemView.findViewById(R.id.grid_image3);
            imageView4 = itemView.findViewById(R.id.grid_image4);
        }
    }
}