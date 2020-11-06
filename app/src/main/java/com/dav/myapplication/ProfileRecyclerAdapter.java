package com.dav.myapplication;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.dav.myapplication.databinding.ProfileRecyclerItemBinding;
import com.dav.myapplication.databinding.ProfileRecyclerItemWithSwitcherBinding;
import com.dav.myapplication.databinding.RecyclerSpaceTypeItemBinding;

import java.util.Arrays;
import java.util.List;

public class ProfileRecyclerAdapter extends RecyclerView.Adapter<ProfileRecyclerAdapter.ProfileViewHolder> {

    private List<ProfileListItem> profileListItems = Arrays.asList(Constants.PROFILE_LIST_ITEMS_ARRAY);

    @NonNull
    @Override
    public ProfileViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());

        if (viewType == ProfileItemType.SWITCHER.getValue()) {
            ProfileRecyclerItemWithSwitcherBinding itemWithSwitcherBinding = ProfileRecyclerItemWithSwitcherBinding.inflate(layoutInflater, parent, false);
            return new ProfileViewHolder(itemWithSwitcherBinding);
        }else if(viewType == ProfileItemType.CATEGORY.getValue()){
            ProfileRecyclerItemBinding recyclerItemBinding = ProfileRecyclerItemBinding.inflate(layoutInflater, parent, false);
            return new ProfileViewHolder(recyclerItemBinding);
        }

        RecyclerSpaceTypeItemBinding spaceTypeItemBinding = RecyclerSpaceTypeItemBinding.inflate(layoutInflater,parent,false);
        return new ProfileViewHolder(spaceTypeItemBinding);

    }

    @Override
    public void onBindViewHolder(@NonNull ProfileViewHolder holder, int position) {
        int adapterPosition = holder.getBindingAdapterPosition();
        if (adapterPosition != RecyclerView.NO_POSITION) {
            ProfileListItem item = profileListItems.get(adapterPosition);
            int itemType = getItemViewType(adapterPosition);

            if(itemType == ProfileItemType.CATEGORY.value){
                holder.recyclerItemBinding.profileItemIcon.setImageResource(profileListItems.get(holder.getBindingAdapterPosition()).getImageRes());
                holder.recyclerItemBinding.profileItemTitle.setText(profileListItems.get(holder.getBindingAdapterPosition()).getTitle());
            }else if(itemType == ProfileItemType.SWITCHER.value){
                holder.itemWithSwitcherBinding.profileItemIcon.setImageResource(profileListItems.get(holder.getBindingAdapterPosition()).getImageRes());
                holder.itemWithSwitcherBinding.profileItemTitle.setText(profileListItems.get(holder.getBindingAdapterPosition()).getTitle());
            }else {
                holder.spaceTypeItemBinding.profileItemSlimSeparator.setAlpha(0.5f);
            }
        }
    }

    @Override
    public int getItemViewType(int position) {
        return profileListItems.get(position).getItemType().value;
    }

    @Override
    public int getItemCount() {
        return profileListItems.size();
    }

    class ProfileViewHolder extends RecyclerView.ViewHolder {

        private ProfileRecyclerItemBinding recyclerItemBinding;
        private ProfileRecyclerItemWithSwitcherBinding itemWithSwitcherBinding;
        private RecyclerSpaceTypeItemBinding spaceTypeItemBinding;

        public ProfileViewHolder(@NonNull ProfileRecyclerItemBinding binding) {
            super(binding.getRoot());
            this.recyclerItemBinding = binding;
        }

        public ProfileViewHolder(@NonNull ProfileRecyclerItemWithSwitcherBinding binding) {
            super(binding.getRoot());
            this.itemWithSwitcherBinding = binding;
        }

        public ProfileViewHolder(@NonNull RecyclerSpaceTypeItemBinding binding){
            super(binding.getRoot());
            this.spaceTypeItemBinding = binding;
        }
    }
}
