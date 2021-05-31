package com.vdh.uinew.Fragment;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.vdh.uinew.R;
import com.vdh.uinew.adapter.BookAdapter;
import com.vdh.uinew.databinding.FragmentBookBinding;
import com.vdh.uinew.model.Book;
import com.vdh.uinew.viewmodel.BookViewModel;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

public class BookFragment extends Fragment {

    private FragmentBookBinding binding;
    private BookViewModel bookViewModel;
    public BookFragment() {
    }

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        bookViewModel =
                new ViewModelProvider(this).get(BookViewModel.class);

        binding = FragmentBookBinding.inflate(inflater, container, false);
        View root = binding.getRoot();
        return root;
    }

    @Override
    public void onViewCreated(@NonNull @NotNull View view, @Nullable @org.jetbrains.annotations.Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initBookList();
    }

    public void initBookList() {
        List<Book> mList = new ArrayList<>();
        mList.add(new Book(R.drawable.img_test, "Tittle", "Author", "Discribe"));
        mList.add(new Book(R.drawable.img_test, "Tittle", "Author", "Discribe"));
        mList.add(new Book(R.drawable.img_test, "Tittle", "Author", "Discribe"));
        mList.add(new Book(R.drawable.img_test, "Tittle", "Author", "Discribe"));
        mList.add(new Book(R.drawable.img_test, "Tittle", "Author", "Discribe"));
        mList.add(new Book(R.drawable.img_test, "Tittle", "Author", "Discribe"));
        RecyclerView revBook =binding.rcvListBook;
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getActivity(),3);
        revBook.setLayoutManager(gridLayoutManager);
        BookAdapter adapter = new BookAdapter();
        adapter.setData(mList);
        revBook.setAdapter(adapter);
    }
}