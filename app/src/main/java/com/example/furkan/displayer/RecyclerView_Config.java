package com.example.furkan.displayer;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecyclerView_Config {
    private Context mContext;
    private StudentsAdapter mStudentsAdapter;
    public void setConfig(RecyclerView recyclerView, Context context,List<Students> students,List<String> keys){
        mContext = context;
        mStudentsAdapter = new StudentsAdapter(students,keys);
        recyclerView.setLayoutManager(new LinearLayoutManager(context));
        recyclerView.setAdapter(mStudentsAdapter);
    }

    class StudentsItemView extends RecyclerView.ViewHolder{
        private TextView mName;
        private TextView msurName;
        private TextView mNo;
        private TextView mbtAddress;
        private TextView mTime;

        private String key;

        public StudentsItemView(ViewGroup parent){
            super(LayoutInflater.from(mContext).
                    inflate(R.layout.student_list_item, parent,false));

            mName = (TextView) itemView.findViewById(R.id.stuName_textView);
            msurName = (TextView) itemView.findViewById(R.id.stuSurname_textView);
            mNo = (TextView) itemView.findViewById(R.id.stuNo_textView);
            mbtAddress = (TextView) itemView.findViewById(R.id.btAddress_textView);
            mTime = itemView.findViewById(R.id.time_textView);

        }

        public void bind(Students students, String key){
            mName.setText(students.getStuName());
            msurName.setText(students.getStuSurname());
            //mNo.setText(students.getStuNo());
            //Öğrenci Numarası long tipinden stringe çeviremediği için hata veriyor
            //Niye çözemedim.

            mbtAddress.setText(students.getBtAddress());
            mTime.setText(students.getTime());
            this.key = key;
        }


    }

    class StudentsAdapter extends RecyclerView.Adapter<StudentsItemView>{
        private List<Students> mStudentList;
        private List<String> mKeys;

        public StudentsAdapter(List<Students> mStudentList, List<String> mKeys) {
            this.mStudentList = mStudentList;
            this.mKeys = mKeys;
        }

        @NonNull
        @Override
        public StudentsItemView onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            return new StudentsItemView(parent);
        }

        @Override
        public void onBindViewHolder(@NonNull StudentsItemView holder, int position) {
            holder.bind(mStudentList.get(position), mKeys.get(position));
        }

        @Override
        public int getItemCount() {
            return mStudentList.size();
        }
    }
}
