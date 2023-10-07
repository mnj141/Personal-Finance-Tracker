package com.example.personalfinancetracker01.fragments;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.personalfinancetracker01.R;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.personalfinancetracker01.adapter.ExpenseAdapter;
import com.example.personalfinancetracker01.adapter.ExpenseItem;

import java.util.ArrayList;
import java.util.List;

public class ExpensesFragment extends Fragment {

    // Define your dummy expense data
    private List<ExpenseItem> expenseList = new ArrayList<>();

    // Define RecyclerView and adapter
    private RecyclerView recyclerView;
    private ExpenseAdapter expenseAdapter;

    public ExpensesFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_expense, container, false);

        // Initialize RecyclerView
        recyclerView = rootView.findViewById(R.id.recyclerViewExpenses);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        // Create and set the adapter
        expenseAdapter = new ExpenseAdapter(expenseList);
        recyclerView.setAdapter(expenseAdapter);


        // Initialize the list only once
        if (expenseList.isEmpty()) {
            expenseList.add(new ExpenseItem("Grocery", "$20", "2023-10-23"));
            expenseList.add(new ExpenseItem("Dining Out", "$30", "2023-10-23"));
            expenseList.add(new ExpenseItem("Transportation", "$15", "2023-10-23"));
            expenseList.add(new ExpenseItem("Utilities", "$50", "2023-10-23"));
            expenseList.add(new ExpenseItem("Entertainment", "$25", "2023-10-23"));
            expenseList.add(new ExpenseItem("Healthcare", "$40", "2023-10-23"));
            expenseList.add(new ExpenseItem("Shopping", "$60", "2023-10-23"));
            expenseList.add(new ExpenseItem("Education", "$100", "2023-10-23"));
            expenseList.add(new ExpenseItem("Travel", "$80", "2023-10-23"));
            expenseList.add(new ExpenseItem("Insurance", "$75", "2023-10-23"));
            expenseList.add(new ExpenseItem("Home", "$70", "2023-10-23"));
            expenseList.add(new ExpenseItem("Gifts", "$45", "2023-10-23"));
            expenseList.add(new ExpenseItem("Miscellaneous", "$55", "2023-10-23"));
            // Add more initial dummy data as needed
        }  // Add more dummy data as needed

        return rootView;
    }
}
