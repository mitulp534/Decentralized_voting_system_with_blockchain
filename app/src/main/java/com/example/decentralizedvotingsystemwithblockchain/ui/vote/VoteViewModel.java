package com.example.decentralizedvotingsystemwithblockchain.ui.vote;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class VoteViewModel extends ViewModel {
    private MutableLiveData<String> mText;
    public VoteViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is Vote fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}
