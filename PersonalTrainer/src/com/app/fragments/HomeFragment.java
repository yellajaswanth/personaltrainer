package com.app.fragments;

import it.gmariotti.cardslib.library.internal.Card;
import it.gmariotti.cardslib.library.internal.CardArrayAdapter;
import it.gmariotti.cardslib.library.internal.CardHeader;
import it.gmariotti.cardslib.library.internal.CardThumbnail;
import it.gmariotti.cardslib.library.view.CardListView;

import java.util.ArrayList;

import android.app.Activity;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.app.personaltrainer.MainActivity;
import com.app.personaltrainer.R;

public class HomeFragment extends Fragment {

	public static final String TAG = MainActivity.class.getSimpleName();
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View rootView = inflater.inflate(R.layout.fragment_main,
				container, false);				

		return rootView;
	}
	
	@Override
	public void onResume() {
		super.onResume();
		
		 ArrayList<Card> cards = new ArrayList<Card>();
		 
	        for (int i = 0; i<5; i++) {
	            // Create a Card
	            Card card = new Card(getView().getContext());
	            // Create a CardHeader
	            CardHeader header = new CardHeader(getView().getContext());
	            // Add Header to card
	            header.setTitle("Angry bird: " + i);
	            card.setTitle("sample title");
	            card.addCardHeader(header);
	 
	            CardThumbnail thumb = new CardThumbnail(getView().getContext());
	            thumb.setDrawableResource(R.drawable.ic_drawer);
	            card.addCardThumbnail(thumb);
	 
	            cards.add(card);
	        }
	 
	        CardArrayAdapter mCardArrayAdapter = new CardArrayAdapter(getView().getContext(), cards);
	 
	        CardListView listView = (CardListView) getView().findViewById(R.id.myList);
	        if (listView != null) {
	            listView.setAdapter(mCardArrayAdapter);
	        }
		
	}
	

}