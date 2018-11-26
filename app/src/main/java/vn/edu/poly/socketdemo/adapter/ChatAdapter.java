package vn.edu.poly.socketdemo.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import vn.edu.poly.socketdemo.R;
import vn.edu.poly.socketdemo.holder.ChatHolder;
import vn.edu.poly.socketdemo.model.Chat;

public class ChatAdapter extends RecyclerView.Adapter<ChatHolder> {

    public Context context;
    public List<Chat> chats;


    public ChatAdapter(Context context, List<Chat> chats) {
        this.context = context;
        this.chats = chats;
    }


    @NonNull
    @Override
    public ChatHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View root = LayoutInflater.from(context).inflate(R.layout.item_chat, viewGroup, false);
        return new ChatHolder(root);
    }

    @Override
    public void onBindViewHolder(@NonNull ChatHolder chatHolder, int i) {
        Chat chat = chats.get(i);
        chatHolder.tvName.setText(chat.name);
        chatHolder.tvMessage.setText(chat.message);
    }

    @Override
    public int getItemCount() {
        return chats.size();
    }
}
