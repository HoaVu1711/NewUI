package com.vdh.uinew.Fragment;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.vdh.uinew.R;
import com.vdh.uinew.adapter.BookAdapter;
import com.vdh.uinew.model.Book;

import java.util.ArrayList;
import java.util.List;

public class CaterogyFragment extends Fragment {
  private View view;
    public CaterogyFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
       view=inflater.inflate(R.layout.fragment_caterogy, container, false);
       initBookList();
        return view;
    }
    public void initBookList() {
        List<Book> mList = new ArrayList<>();
        mList.add(new Book(R.drawable.img_test, "Tittle", "Author", "Discribe"));
        mList.add(new Book(R.drawable.img_test, "Tittle", "Author", "Discribe"));
        mList.add(new Book(R.drawable.img_test, "Tittle", "Author", "Discribe"));
        mList.add(new Book(R.drawable.img_test, "Tittle", "Author", "Discribe"));
        mList.add(new Book(R.drawable.img_test, "Tittle", "Author", "Discribe"));
        mList.add(new Book(R.drawable.img_test, "Tittle", "Author", "Discribe"));
        RecyclerView revBook =view.findViewById(R.id.rcv_caterogy);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getActivity(),3);
        revBook.setLayoutManager(gridLayoutManager);
        BookAdapter adapter = new BookAdapter();
        adapter.setData(mList);
        revBook.setAdapter(adapter);
    }
}