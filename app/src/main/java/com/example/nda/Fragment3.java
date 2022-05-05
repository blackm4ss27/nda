package com.example.nda;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Fragment3#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Fragment3 extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public Fragment3() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Fragment3.
     */
    // TODO: Rename and change types and number of parameters
    public static Fragment3 newInstance(String param1, String param2) {
        Fragment3 fragment = new Fragment3();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    //declarar variables
    private View view;
    private EditText txtNum1, txtNum2;
    private Button btnSuma, btnResta, btnProducto, btnDiv, btnPotencia, btnRaiz, btnPorcentaje, btnFactorial, btnLimpiar, btnSalir;

    private TextView txtResultado;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_3, container, false);
        txtNum1 = view.findViewById(R.id.txtNro1);
        txtNum2 = view.findViewById(R.id.txtNro2);
        btnSuma = view.findViewById(R.id.btnSumar);
        btnResta = view.findViewById(R.id.btnRestar);
        btnProducto = view.findViewById(R.id.btnProductos);
        btnDiv = view.findViewById(R.id.btnDivs);
        btnPotencia = view.findViewById(R.id.btnPotenciar);
        btnRaiz = view.findViewById(R.id.btnRaices);
        btnPorcentaje = view.findViewById(R.id.btnPorcentajes);
        btnFactorial = view.findViewById(R.id.btnFactoriales);

        btnSuma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double numero1 = Double.parseDouble(txtNum1.getText().toString());
                double numero2 = Double.parseDouble(txtNum2.getText().toString());
                double resultado = numero1 + numero2;
                txtResultado.setText("La suma es: " +resultado);
            }
        });

        btnResta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double numero1 = Double.parseDouble(txtNum1.getText().toString());
                double numero2 = Double.parseDouble(txtNum2.getText().toString());
                double resultado = numero1 - numero2;
                txtResultado.setText("La resta es: " +resultado);
            }
        });

        btnProducto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double numero1 = Double.parseDouble(txtNum1.getText().toString());
                double numero2 = Double.parseDouble(txtNum2.getText().toString());
                double resultado = numero1 * numero2;
                txtResultado.setText("El producto es: " +resultado);
            }
        });

        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double numero1 = Double.parseDouble(txtNum1.getText().toString());
                double numero2 = Double.parseDouble(txtNum2.getText().toString());
                double resultado = numero1 / numero2;
                txtResultado.setText("La división es: " +resultado);
            }
        });

        btnPotencia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double numero1 = Double.parseDouble(txtNum1.getText().toString());
                double numero2 = Double.parseDouble(txtNum2.getText().toString());
                double aux = 1;
                if (numero2==0){
                    double resultado = 1;
                }
                else{
                    while (numero2 > 0){
                        aux = aux * numero1;
                        numero2--;
                    }
                }
                double resultado = aux;
                txtResultado.setText("La potencia es: " +resultado);
            }
        });

        btnRaiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double numero1 = Double.parseDouble(txtNum1.getText().toString());
                double resultado = Math.sqrt(numero1);
                txtResultado.setText("La raíz cuadrada es: " +resultado);
            }
        });

        btnPorcentaje.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double numero1 = Double.parseDouble(txtNum1.getText().toString());
                double resultado = numero1 / 100;
                txtResultado.setText("El porcentaje es: " +resultado);
            }
        });

        btnFactorial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double numero1 = Double.parseDouble(txtNum1.getText().toString());
                int cont = 1;
                double aux = 1;
                while (cont <= numero1){
                    aux = aux * cont;
                    cont++;
                }
                double resultado = aux;
                txtResultado.setText("El factorial es: " +resultado);
            }
        });

        btnLimpiar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtNum1.setText("");
                txtNum2.setText("");
                txtResultado.setText("");
            }
        });


        // Inflate the layout for this fragment
        return view;
    }
}