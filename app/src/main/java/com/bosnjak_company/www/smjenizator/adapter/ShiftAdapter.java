package com.bosnjak_company.www.smjenizator.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bosnjak_company.www.smjenizator.R;
import com.bosnjak_company.www.smjenizator.animations.CircleTransform;
import com.bosnjak_company.www.smjenizator.data.Shifts;
import com.squareup.picasso.Picasso;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ShiftAdapter extends RecyclerView.Adapter<ShiftAdapter.MyViewHolder> {

    private Context mContext;
    private List<Shifts> mShiftsList;

    public class MyViewHolder extends RecyclerView.ViewHolder {

        @BindView(R.id.dateText)
        TextView dateText;
        @BindView(R.id.day_text)
        TextView dayText;
        @BindView(R.id.currentShift)
        TextView currentShift;
        @BindView(R.id.imageBole)
        ImageView imageBole;

        public MyViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }

    public ShiftAdapter(Context mContext, List<Shifts> shifts) {
        this.mContext = mContext;
        this.mShiftsList = shifts;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.shift_ui, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {

        Shifts shifts = mShiftsList.get(position);

        holder.currentShift.setText(shifts.getShift());
        holder.dateText.setText(shifts.getDate());
        holder.dayText.setText(shifts.getDay());

        Picasso.with(mContext).load(shifts.getPhotoId()).transform(new CircleTransform()).into(holder.imageBole);
    }


    @Override
    public int getItemCount() {
        return mShiftsList.size();
    }

}
