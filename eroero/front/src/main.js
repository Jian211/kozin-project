import { createApp } from 'vue'
import App from './App.vue'
import router from './router'

// bootstrap
import 'bootstrap'
import 'bootstrap/dist/css/bootstrap.min.css'

// mixin
import mixin from './mixin'

const app = createApp(App);


app.use(router)

app.mixin(mixin)

app.mount('#app')
