package com.thunder.thundertweaks.fragments.kernel;

import android.content.res.ColorStateList;
import android.graphics.Color;
import androidx.core.content.ContextCompat;

import com.thunder.thundertweaks.R;
import com.thunder.thundertweaks.fragments.DescriptionFragment;
import com.thunder.thundertweaks.fragments.recyclerview.RecyclerViewFragment;
import com.thunder.thundertweaks.utils.AppSettings;
import com.thunder.thundertweaks.utils.kernel.spectrum.Spectrum;
import com.thunder.thundertweaks.views.recyclerview.CardView;
import com.thunder.thundertweaks.views.recyclerview.DescriptionView;
import com.thunder.thundertweaks.views.recyclerview.RecyclerViewItem;

import java.util.List;

/**
 * Created by Morogoku on 28/07/2017.
 * Modded by nalas on 15/06/2019 - added ThundeRStormS card
 */

public class SpectrumFragment extends RecyclerViewFragment {

    @Override
    protected void init() {
        super.init();

        addViewPagerFragment(DescriptionFragment.newInstance(getString(R.string.spec_title), getString(R.string.spec_info)));

    }

    private CardView oldCard;
    private DescriptionView oldDesc;


    @Override
    protected void addItems(List<RecyclerViewItem> items) {

        final int balColor = ContextCompat.getColor(getContext(), R.color.colorBalance);
        final int perColor = ContextCompat.getColor(getContext(), R.color.colorPerformance);
        final int batColor = ContextCompat.getColor(getContext(), R.color.colorBattery);
        final int gamColor = ContextCompat.getColor(getContext(), R.color.colorGaming);
		final int thunderColor = ContextCompat.getColor(getContext(), R.color.colorThundeRStormS);
		final int thundergColor = ContextCompat.getColor(getContext(), R.color.colorThundeRG);
		final int thunderrColor = ContextCompat.getColor(getContext(), R.color.colorThundeRR);


        //CardView Balanced
        final CardView card0 = new CardView(getActivity());
        card0.setTitle(getString(R.string.spec_balanced));
        card0.setExpandable(false);

        final DescriptionView desc0 = new DescriptionView();
        desc0.setSummary(getString(R.string.spec_balanced_summary));
        desc0.setDrawable(ContextCompat.getDrawable(getContext(), R.drawable.ic_spectrum_balanced));

        card0.setOnItemClickListener(new CardView.OnItemClickListener() {
            @Override
            public void onClick(RecyclerViewItem item) {
                cardClick(card0, desc0, 0, balColor);
            }
        });

        card0.addItem(desc0);
        items.add(card0);


        //CardView Performance
        final CardView card1 = new CardView(getActivity());
        card1.setTitle(getString(R.string.spec_performance));
        card1.setExpandable(false);

        final DescriptionView desc1 = new DescriptionView();
        desc1.setSummary(getString(R.string.spec_performance_summary));
        desc1.setDrawable(ContextCompat.getDrawable(getContext(), R.drawable.ic_spectrum_performance));

        card1.setOnItemClickListener(new CardView.OnItemClickListener() {
            @Override
            public void onClick(RecyclerViewItem item) {
                cardClick(card1, desc1, 1, perColor);
            }

        });

        card1.addItem(desc1);
        items.add(card1);


        //CardView Battery
        final CardView card2 = new CardView(getActivity());
        card2.setTitle(getString(R.string.spec_battery));
        card2.setExpandable(false);

        final DescriptionView desc2 = new DescriptionView();
        desc2.setSummary(getString(R.string.spec_battery_summary));
        desc2.setDrawable(ContextCompat.getDrawable(getContext(), R.drawable.ic_spectrum_battery));

        card2.setOnItemClickListener(new CardView.OnItemClickListener() {
            @Override
            public void onClick(RecyclerViewItem item) {
                cardClick(card2, desc2, 2, batColor);
            }

        });

        card2.addItem(desc2);
        items.add(card2);


        //CardView Gaming
        final CardView card3 = new CardView(getActivity());
        card3.setTitle(getString(R.string.spec_gaming));
        card3.setExpandable(false);

        final DescriptionView desc3 = new DescriptionView();
        desc3.setSummary(getString(R.string.spec_gaming_summary));
        desc3.setDrawable(ContextCompat.getDrawable(getContext(), R.drawable.ic_spectrum_game));

        card3.setOnItemClickListener(new CardView.OnItemClickListener() {
            @Override
            public void onClick(RecyclerViewItem item) {
                cardClick(card3, desc3, 3, gamColor);
            }

        });

        card3.addItem(desc3);
        items.add(card3);

        //CardView ThundeRStormS
        final CardView card4 = new CardView(getActivity());
        card4.setTitle(getString(R.string.spec_thunder));
        card4.setExpandable(false);

        final DescriptionView desc4 = new DescriptionView();
        desc4.setSummary(getString(R.string.spec_thunder_summary));
        desc4.setDrawable(ContextCompat.getDrawable(getContext(), R.drawable.ic_spectrum_thunder));

        card4.setOnItemClickListener(new CardView.OnItemClickListener() {
            @Override
            public void onClick(RecyclerViewItem item) {
                cardClick(card4, desc4, 4, thunderColor);
            }
        });

        card4.addItem(desc4);
        items.add(card4);
		
        //CardView ThundeRStormS - Game Over
        final CardView card5 = new CardView(getActivity());
        card5.setTitle(getString(R.string.spec_thunderg));
        card5.setExpandable(false);

        final DescriptionView desc5 = new DescriptionView();
        desc5.setSummary(getString(R.string.spec_thunderg_summary));
        desc5.setDrawable(ContextCompat.getDrawable(getContext(), R.drawable.ic_spectrum_battery));

        card5.setOnItemClickListener(new CardView.OnItemClickListener() {
            @Override
            public void onClick(RecyclerViewItem item) {
                cardClick(card5, desc5, 5, thundergColor);
            }
        });

        card5.addItem(desc5);
        items.add(card5);

        //CardView ThundeRStormS - rtakak
        final CardView card6 = new CardView(getActivity());
        card6.setTitle(getString(R.string.spec_thunderr));
        card6.setExpandable(false);

        final DescriptionView desc6 = new DescriptionView();
        desc6.setSummary(getString(R.string.spec_thunderr_summary));
        desc6.setDrawable(ContextCompat.getDrawable(getContext(), R.drawable.ic_spectrum_battery));

        card6.setOnItemClickListener(new CardView.OnItemClickListener() {
            @Override
            public void onClick(RecyclerViewItem item) {
                cardClick(card6, desc6, 6, thunderrColor);
            }
        });

        card6.addItem(desc6);
        items.add(card6);

        //Detects the selected profile on launch
        int mProfile = AppSettings.getInt("spectrum_profile", 0, getActivity());

        if(mProfile == 0){
            card0.GrxSetInitSelection(true, balColor);
            desc0.GrxSetInitSelection(true, Color.WHITE);
            oldCard = card0;
            oldDesc = desc0;
        } else if(mProfile == 1){
            card1.GrxSetInitSelection(true, perColor);
            desc1.GrxSetInitSelection(true, Color.WHITE);
            oldCard = card1;
            oldDesc = desc1;
        } else if(mProfile == 2){
            card2.GrxSetInitSelection(true, batColor);
            desc2.GrxSetInitSelection(true, Color.WHITE);
            oldCard = card2;
            oldDesc = desc2;
        } else if(mProfile == 3){
            card3.GrxSetInitSelection(true, gamColor);
            desc3.GrxSetInitSelection(true, Color.WHITE);
            oldCard = card3;
            oldDesc = desc3;
        } else if(mProfile == 4){
            card4.GrxSetInitSelection(true, thunderColor);
            desc4.GrxSetInitSelection(true, Color.WHITE);
            oldCard = card4;
            oldDesc = desc4;
        } else if(mProfile == 5){
            card5.GrxSetInitSelection(true, thundergColor);
            desc5.GrxSetInitSelection(true, Color.WHITE);
            oldCard = card5;
            oldDesc = desc5;
        } else if(mProfile == 6){
            card6.GrxSetInitSelection(true, thunderrColor);
            desc6.GrxSetInitSelection(true, Color.WHITE);
            oldCard = card6;
            oldDesc = desc6;
        }

    }

    // Method that completes card onClick tasks
    private void cardClick(CardView card, DescriptionView desc, int prof, int color) {
        if (oldCard != card && oldDesc != desc) {
            ColorStateList ogColor = card.getCardBackgroundColor();
            ColorStateList odColor = desc.getTextColors();
            card.setCardBackgroundColor(color);
            desc.setTextColor(Color.WHITE);
            if(oldCard != null) oldCard.setCardBackgroundColor(ogColor);
            if(oldDesc != null) oldDesc.setTextColor(odColor);
            Spectrum.setProfile(prof);
            oldCard = card;
            oldDesc = desc;
            AppSettings.saveInt("spectrum_profile", prof, getActivity());
        }
    }
}
