package nyc.c4q.medihow;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

import com.google.android.gms.maps.model.LatLng;

import java.util.List;

import nyc.c4q.medihow.model.MedicareOffice;
import nyc.c4q.medihow.model.SurveyQuestions;
import nyc.c4q.medihow.retrofit.RetrofitClient;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by c4q on 3/3/18.
 */

public class SurveyActivity extends AppCompatActivity {
   // Context context;
    public static final String RETRIEVE = "retrieving questions";
    private RadioButton yes,no;
    private TextView question;
    private Button next;

   @Override
    public void onCreate(Bundle savedInstanceState) {
       super.onCreate(savedInstanceState);
       //setContentView(R.id.);
        yes= findViewById(R.id.yes_radio_button);
        no= findViewById(R.id.no_radio_button);
        question= findViewById(R.id.question);
        next= findViewById(R.id.next);

        question.setText(SurveyQuestions.questions[0]);
//       getSurveyQuestions();
   }

    public SurveyQuestions getSurveyQuestions() {
        SurveyQuestions surveyQuestions= new SurveyQuestions();
        surveyQuestions.questions[0] = getString(R.string.prove_identity);
        surveyQuestions.questions[1] = getString(R.string.prove_income);
        surveyQuestions.questions[2] = getString(R.string.prove_address);
        surveyQuestions.questions[3] = getString(R.string.prove_dependent_care);
        surveyQuestions.questions[4] = getString(R.string.prove_previous_insurance);
        surveyQuestions.questions[5] = getString(R.string.prove_pregnancy);
        surveyQuestions.questions[6] = getString(R.string.prove_immigrant_status);

        Log.d(RETRIEVE, "getSurveyQuestions: ");
        return surveyQuestions;
    }

}
