package com.example.danhnhan;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;


import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ListView listViewDN;
    private AdapterDanhNhan adapter;
    private EditText edtSearch;

    private ImageButton deleteTextFind;
    private ImageButton btn2;
    private TextView txtNotfound;
    private ImageView notfound;

    private Boolean check =false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listViewDN = findViewById(R.id.listDanhNhan);
        deleteTextFind = findViewById(R.id.deleteTextFind);
        txtNotfound = findViewById(R.id.txtNotfound);
        notfound = findViewById(R.id.notfound);
        btn2 = findViewById(R.id.btnSearch);
        adapter = new AdapterDanhNhan();
        edtSearch = findViewById(R.id.edtSearch);
        getWindow().setStatusBarColor(ContextCompat.getColor(this, R.color.white_blue));

        deleteTextFind.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edtSearch.setText("");

            }
        });



        int [] img = {R.drawable.i1,R.drawable.i2,R.drawable.i3,R.drawable.i4,R.drawable.i5,R.drawable.i6,R.drawable.i7,R.drawable.i8,R.drawable.i9,R.drawable.i10,R.drawable.i11,R.drawable.i12,R.drawable.i13,R.drawable.i14,R.drawable.i15};
        String[] name = {"Nguyễn Du", "Nguyễn Trãi","Nguyễn Văn Tố","Hồ Chí Minh","Vương Hồng Sển","Đào Tấn","Hoàng Xuân Hãn","Mạc Đĩnh Chi","Ngô Thì Sĩ","Bà Huyện Thanh Quan","Nguyễn Tri Phương","Phan Đình Phùng","Ngô Thì Nhậm","Phạm Ngũ Lão","Nguyễn Bỉnh Khiêm"};
        String[] description = {            "Tên tự Tố Như (素如), hiệu Thanh Hiên (清軒), biệt hiệu Hồng Sơn lạp hộ (鴻山獵戶), Nam Hải điếu đồ (南海釣屠), là một nhà thơ, nhà văn hóa lớn thời Lê mạt, Nguyễn sơ ở Việt Nam. Ông được người Việt kính trọng tôn xưng là Đại thi hào dân tộc. Tác phẩm Truyện Kiều của ông được xem là một kiệt tác văn học, một trong những thành tựu tiêu biểu nhất trong nền văn học trung đại Việt Nam."
                , "Hiệu là Ức Trai (抑齋), là một nhà chính trị, nhà thơ dưới thời nhà Hồ và nhà Lê sơ Việt Nam. Thi đỗ Thái học sinh năm 1400, Nguyễn Trãi làm quan dưới triều Hồ, nhà Minh xâm lược, cha ông là Nguyễn Phi Khanh đầu hàng rồi bị bắt giải về Trung Quốc, Nguyễn Trãi đi theo. Đến ải Nam Quan,cha ông khuyên ông nên quay về để trả nợ nước,báo thù nhà, ông làm theo. Sau khi nước Đại Ngu rơi vào sự cai trị của nhà Minh, Nguyễn Trãi tham gia vào cuộc khởi nghĩa Lam Sơn do Lê Lợi lãnh đạo chống lại ách Minh thuộc. Ông trở thành mưu sĩ của nghĩa quân Lam Sơn trong việc bày tính mưu kế cũng như soạn thảo các văn thư ngoại giao với quân Minh. Năm 1442, toàn thể gia đình Nguyễn Trãi bị tru di tam tộc trong vụ án Lệ Chi Viên. Năm 1464, vua Lê Thánh Tông xuống chiếu giải oan cho ông. Nguyễn Trãi là một nhà văn hoá lớn, có đóng góp to lớn vào sự phát triển của văn học và tư tưởng Việt Nam. Ông nằm trong danh sách 14 anh hùng dân tộc Việt Nam."
                ,"Bút hiệu Ứng Hoè, sinh ngày 5 tháng 6 năm 1889, quê ở Hà Đông (nay thuộc Hà Nội). Thuở nhỏ ông học chữ Hán, sau sang Pháp học đỗ bằng Thành chung (Trung học). Về nước ông làm việc tại trường Viễn Đông Bác Cổ Hà Nội, chuyên về văn học cổ Việt Nam. Ông từng làm Hội trưởng hội Trí Tri, Hội truyền bá chữ Quốc ngữ trước năm 1945. Sau Cách mạng tháng Tám, ông giữ chức Bộ trưởng Cứu tế Xã hội trong chính phủ cách mạng lâm thời. Ông là Đại biểu quốc hội, Chủ tịch Quốc hội khóa I, Quốc vụ khanh trong Chính phủ liên hiệp Việt Nam lâm thời (1946)."
                ,"Nhắc đến danh nhân văn hóa thế giới, đầu tiên chúng ta phải nói đến những danh nhân của nước nhà, mà tiêu biểu nhất là Bác Hồ. Chủ tịch Hồ Chí Minh là vị lãnh tụ có trình độ học vấn uyên thâm, uyên bác, người có trí tuệ siêu việt của thế kỉ XX (UNESCO). Người đề cập đến tất cả mọi lĩnh vực của đời sống xã hội. Người để lại dấu ấn sâu đậm trong quá trình phát triển xã hội loài người ở thế kỉ XX. Góp phần vào sự phát triển các giá trị văn hóa chung của nhân loại."
                ,"Bút hiệu Anh Vương, Vân Đường, Đạt Cổ Trai, là một nhà văn hóa, học giả, nhà sưu tập đồ cổ nổi tiếng. Ông được xem là người có hiểu biết sâu rộng về miền Nam và rất được kính trọng trong giới sử học và khảo cổ ở Việt Nam. Khi chết ông đã hiến tặng ngôi nhà (Vân đường phủ) và toàn bộ sưu tập đồ cổ của mình cho Nhà nước Việt Nam (tổng cộng 849 cổ vật khác nhau) với hy vọng thành lập một bảo tàng mang tên ông. Năm 2003, Ủy ban Nhân dân Thành phố Hồ Chí Minh ra quyết định xếp hạng di tích lịch sử cấp thành phố ngôi nhà này (địa chỉ: số 9/1 đường Nguyễn Thiện Thuật, phường 14, Quận Bình Thạnh)."
                ,"Tự là Chỉ Thúc, hiệu là Tô Giang và Mộng Mai, biệt hiệu là Tiểu Linh Phong Mai Tăng hoặc Mai Tăng, là một nhà soạn tuồng nổi tiếng Việt Nam. Ông là vị quan thanh liêm thời nhà Nguyễn, đã từng giữ chức vụ Tổng đốc An - Tĩnh (Nghệ An - Hà Tĩnh), Công Bộ Thượng thư."
                ,"Là một nhà sử học, nhà ngôn ngữ học, nhà nghiên cứu văn hóa, giáo dục Việt Nam đồng thời là một kỹ sư, nhà toán học. Ông là người soạn thảo và ban hành Chương trình Trung học Việt Nam đầu tiên."
                ,"Tên tự là Tiết Phu (節夫), hiệu là Tích Am (僻庵) là một quan đại thần triều Trần trong lịch sử Việt Nam."
                ,"Tự Thế Lộc, hiệu Ngọ Phong (午峰), đạo hiệu Nhị Thanh cư sĩ; là nhà sử học, nhà văn, nhà thơ nổi tiếng ở thế kỷ 18 tại Việt Nam; được Phan Huy Chú đánh giá là người có \"học vấn sâu rộng, văn chương hùng vĩ, làm rạng rỡ cho tông phái nho gia, là một đại gia ở Nam Châu\"."
                ,"Bà là một nhà thơ nổi tiếng. Thơ của bà điêu luyện, chuẩn mực về niêm luật, hàm súc giàu nhạc điệu. Nhờ vậy mà thời kỳ bà theo chồng vào làm việc ở Huế, bà được vua Minh Mạng sung vào triều làm Cung Trung giáo tập để dạy công chúa và các cung nhân học. Năm 1847, sau khi chồng mất, bà đưa các con về sống tại quê, năm sau thì qua đời, hưởng thọ 43 tuổi. Một số tác phẩm thơ Nôm nổi tiếng của bà: Chiều hôm nhớ nhà, Thăng Long hoài cổ, Qua đèo Ngang…."
                ,"Ông là vị tổng chỉ huy quân đội triều đình nhà Nguyễn chống lại quân Pháp xâm lược lần lượt các mặt trận Đà Nẵng (1858), Gia Định (1861) và Hà Nội (1873). Ông làm quan dưới 3 triều vua: Vua Minh Mạng, Thiệu Trị và Tự Đức lập được nhiều công trạng trong việc trị nước, an dân."
                ,"Ông đỗ Tiến sĩ năm 1877, làm quan đến chức Ngự sử. Năm 1883, do không tán thành việc Tôn Thất Thuyết phế vua Dục Đức, ông bị đuổi về quê. Năm 1885, hưởng ứng hịch Cần Vương, ông đứng ra mộ quân chống Pháp. Trong 10 năm kháng chiến gian khổ, nghĩa quân dưới quyền chỉ huy của ông đã hoạt động rất mạnh từ Hà Tĩnh đến Quảng Bình, gây cho thực dân Pháp nhiều tổn thất nặng nề. Ông mất năm 1895, phong trào Cần Vương chống Pháp ở Nghệ - Tĩnh cũng suy yếu và tan rã từ đó."
                ,"Ông là Danh sỹ thời Hậu Lê - Tây Sơn. Năm 1765, ông đỗ thi Hương, năm 1779, đỗ Tiến sỹ, được bổ làm Hộ khoa cấp sự trung, rồi giám sát ngự sử đạo Sơn Nam, sau đổi làm Đốc đồng trấn Kinh Bắc. Ông làm quan từ thời Hậu Lê tới thời Tây Sơn."
                ,"Ông là một danh tướng của nhà Trần, có công lao lớn trong cuộc kháng chiến chống quân xâm lược Nguyên - Mông. Không chỉ có tài về quân sự, mà ông còn để lại nhiều bài thơ về chí trai, lòng yêu nước. Hiện nay tác phẩm của ông chỉ còn lại hai bài là Thuật hoài (Tỏ lòng) và Vãn Thượng tướng quốc công Hưng Đạo Đại Vương (Viếng Thượng tướng quốc công Hưng Đạo Đại Vương)."
                ,"Ông được biết đến là một nhà văn hóa lớn, nhà tiên tri, tài thơ văn của một nhà giáo có tiếng thời Nam - Bắc triều phân tranh. Sau khi đậu Trạng nguyên năm 1535, làm quan dưới triều Mạc, ông được phong tước Trình Tuyền Hầu, rồi phong tới Trình Quốc Công mà dân gian gọi là Trạng Trình. Người đời coi ông là nhà tiên tri số 1 của lịch sử Việt Nam đồng thời lưu truyền nhiều câu sấm ký được cho là bắt nguồn từ ông và gọi chung là \"Sấm Trạng Trình\". Làm quan 8 năm rồi ông lưu về ở ẩn ở Vân Am mở trường dạy học. Vua Mạc phong ông là Thượng thư bộ lại, Trình quốc công. Ông để lại nhiều tác phẩm nổi tiếng như: Bạch Vân thi tập, Bạch Vân Am tập, Bạch Vân Am quốc ngữ thi tập."};

        String[] born = {"Làng Tiên Điền, huyện Nghi Xuân, tỉnh Hà Tĩnh."
                ,"Chi Ngại, Phượng Sơn, Lạng Giang."
                ,"Hà Đông."
                ,"Xã Kim Liên, huyện Nam Đàn, tỉnh Nghệ An."
                ,"Sóc Trăng."
                ,"Thôn Vinh Thạnh, tổng Thời Tú, huyện Tuy Phước, phủ An Nhơn, tỉnh Bình Định."
                ,"Xã Yên Hồ, huyện Đức Thọ, tỉnh Hà Tĩnh."
                ,"Làng Lũng Động, huyện Chí Linh."
                ,"Làng Tả Thanh Oai, huyện Thanh Oai, tỉnh Hà Đông."
                ,"Làng Nghi Tàm."
                ,"Đường Long (Chí Long), xã Chánh Lộc, huyện Phong Điền, tỉnh Thừa Thiên Huế."
                ,"Làng Đông Thái, huyện Đức Thọ, tỉnh Hà Tĩnh."
                ,"Thanh Oai, Thanh Trì, Hà Đông."
                ,"Làng Phù Ủng, huyện Đường Hào, phủ Thượng Hồng, Hải Dương."
                ,"Làng Trung Am, huyện Vĩnh Lại, phủ Hạ Hồng, trấn Hải Dương."};
        String[] date = {"1766-1820"
                ,"1380-1442"
                ,"1889-1947"
                ,"1890-1969"
                ,"1902-1996"
                ,"1845-1907"
                ,"1908-1996"
                ,"1280-1346"
                ,"1726-1780"
                ,"1805-1848"
                ,"1800-1873"
                ,"1847-1895"
                ,"1746-1803"
                ,"1255-1320"
                ,"1491-1585"};

        ArrayList<DanhNhan> danhNhanArrayList = new ArrayList<>();
        for (int i = 0; i < img.length; i++){
            DanhNhan danhNhan = new DanhNhan(name[i],date[i], born[i], description[i], img[i] );
            danhNhanArrayList.add(danhNhan);
        }

        adapter.setListDN(danhNhanArrayList, "");
        listViewDN.setAdapter(adapter);
        listViewDN.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                DanhNhan dto = (DanhNhan) listViewDN.getItemAtPosition(i);
                Intent intent = new Intent(MainActivity.this, DanhNhanActivity.class);
//                intent.putExtra("name", name[i]);
//                intent.putExtra("description", description[i]);
//                intent.putExtra("born", born[i]);
//                intent.putExtra("date", date[i]);
//                intent.putExtra("img", img[i]);
                intent.putExtra("dto", dto);
                startActivity(intent);
            }
        });


        edtSearch.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                String search = edtSearch.getText().toString();

                adapter.setListDN(danhNhanArrayList, search);
                listViewDN.setAdapter(adapter);

                if (adapter.isEmpty()){
                    txtNotfound.setVisibility(View.VISIBLE);
                    notfound.setVisibility(View.VISIBLE);
                }else{
                    txtNotfound.setVisibility(View.GONE);
                    notfound.setVisibility(View.GONE);
                    listViewDN.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                        @Override
                        public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                            DanhNhan dto = (DanhNhan) listViewDN.getItemAtPosition(i);
                            Intent intent = new Intent(MainActivity.this, DanhNhanActivity.class);
//                            intent.putExtra("name", name[i]);
//                            intent.putExtra("description", description[i]);
//                            intent.putExtra("born", born[i]);
//                            intent.putExtra("date", date[i]);
//                            intent.putExtra("img", img[i]);
                            intent.putExtra("dto", dto);
                            startActivity(intent);
                        }
                    });
                }

            }

            @Override
            public void afterTextChanged(Editable editable) {
            }
        });



        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!check){
                    edtSearch.setVisibility(View.VISIBLE);
                    deleteTextFind.setVisibility(View.VISIBLE);
                    check = !check;
                }else{
                    edtSearch.setVisibility(View.GONE);
                    deleteTextFind.setVisibility(View.GONE);
                    InputMethodManager imm = (InputMethodManager) MainActivity.this.getSystemService(Activity.INPUT_METHOD_SERVICE);
                    imm.hideSoftInputFromWindow(view.getWindowToken(), 0);
                    check = !check;
                }

            }
        });

    }
}