package me.xuender.audiobooks.fp;

import android.content.res.Resources;
import android.graphics.Paint;

import me.xuender.audiobooks.AbstractAudioBookActivity;
import me.xuender.audiobooks.AdRes;

public class AudioBookFpActivity extends AbstractAudioBookActivity {
    @Override
    protected AdRes getAdRes() {
        AdRes rs = new AdRes();
        rs.setExitMsgId(R.string.exit_msg);
        rs.setLayoutId(R.layout.activity_main);
        rs.setRawId(R.raw.fp);
        rs.setMainViewId(R.id.main_audio_view);
        rs.setScrollId(R.id.textView1);
        rs.setScrollTextId(R.array.scroll_text);
        Resources res = getResources();
        rs.setCurrentColor(res.getColor(R.color.current));
        rs.setOtherColor(res.getColor(R.color.other));
        rs.setTextAlign(Paint.Align.LEFT);
        return rs;
    }
}