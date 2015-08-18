package secret.example.com.learnrecycleview;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by echo on 2015/8/18.
 */
class MyAdapter extends RecyclerView.Adapter {
    class ViewHolder extends RecyclerView.ViewHolder {
        private View root;
        private TextView titile,content;

        public ViewHolder(View root) {
            super(root);
            titile=(TextView)root.findViewById(R.id.tvTitle);
            content= (TextView) root.findViewById(R.id.tvContent);

                    }

        public TextView  getTitile() {
            return titile;
        }
        public TextView getContent(){
            return content;
        }

    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new ViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_sell,null));
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        /*
        *��textview���и�ֵ
        * */
        ViewHolder vh = (ViewHolder) viewHolder;
        SellData cd=data[i];
        vh.getTitile().setText(cd.title);
        vh.getContent().setText(cd.content);

    }

    @Override
    public int getItemCount() {
        return data.length;
    }
    private SellData[] data=new SellData[]{new SellData("������","�����"),new SellData("������","�������ȵ�"),new SellData("�û���","һ����"),new SellData("�û���","һ����"),new SellData("�û���","һ����"),new SellData("�û���","һ����"),new SellData("�û���","һ����"),new SellData("�û���","һ����"),new SellData("�û���","һ����"),new SellData("�û���","һ����")};


//    private String[] data = new String[]{"hello", "world", "I am zhanglinlin"};
}
