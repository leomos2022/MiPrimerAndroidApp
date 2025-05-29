# 📱 MiPrimerAndroidApp

Este proyecto fue desarrollado como parte del taller **Android dev hub** del curso de desarrollo móvil. A través de esta aplicación, se aprendieron conceptos clave sobre la configuración del entorno Android Studio, el desarrollo de interfaces, la interacción con botones y la integración con GitHub.

---

## 🧰 Herramientas Utilizadas

- **Android Studio** (versión actual)
- **Java y XML**
- **SDK de Android**
- **Emulador Android Virtual Device (AVD)**
- **Git + GitHub**
- **Terminal (macOS)**

---

## 🛠 Instalación de Android Studio

1. Se descargó la última versión desde: [https://developer.android.com/studio](https://developer.android.com/studio)
2. Durante la instalación:
   - Se aceptaron las configuraciones predeterminadas.
   - Se instalaron el SDK, el emulador y herramientas necesarias.
3. Se creó un emulador con dispositivo Pixel y API nivel 33.
4. Se verificó el funcionamiento correcto con un proyecto de prueba.

---

## 📱 Ejercicio práctico: App "Mi Primer Android"

### Objetivo

Mostrar un mensaje inicial y permitir cambiarlo al presionar un botón, con la posibilidad de alternarlo dinámicamente.

### Estructura de la App

- Un `TextView` con el mensaje `"¡Hola, Android!"`
- Un `Button` que alterna entre `"¡Hola, Android!"` y `"¡Botón presionado!"`

### Código `MainActivity.java`

```java
public class MainActivity extends AppCompatActivity {
    private TextView mensajeTextView;
    private boolean estado = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mensajeTextView = findViewById(R.id.mensajeTextView);
        Button botonCambiar = findViewById(R.id.botonCambiar);

        botonCambiar.setOnClickListener(v -> {
            if (estado) {
                mensajeTextView.setText(R.string.mensaje_inicial);
            } else {
                mensajeTextView.setText(R.string.mensaje_cambiado);
            }
            estado = !estado;
        });
    }
}
