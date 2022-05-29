import { createApp } from 'vue'
import App from './App.vue'
import router from './router'
import VueSweetAlert2 from 'vue-sweetalert2'
import 'sweetalert2/dist/sweetalert2.min.css'


const app = createApp(App)

app.use(router)
app.use(VueSweetAlert2)

app.mount('#app')
