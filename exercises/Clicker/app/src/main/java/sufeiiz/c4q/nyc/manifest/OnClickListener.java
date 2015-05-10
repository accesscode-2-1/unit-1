package sufeiiz.c4q.nyc.manifest;

import android.content.DialogInterface;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

/**
 * Created by sufeizhao on 5/10/15.
 */
public class OnClickListener {

    private TextView text, total;
    private Button button;
    private int count, sum;

    public OnClickListener(Button button, TextView text, TextView total) {
        this.text = text;
        this.button = button;
        this.count = 0;
        this.total = total;
    }

    public void click() {
        this.count++;
        this.text.setText(String.valueOf(count));
        sum = Integer.valueOf(total.getText().toString());

        total.setText(String.valueOf(sum + 1));
    }
}
