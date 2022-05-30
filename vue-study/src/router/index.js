import { createRouter, createWebHashHistory } from 'vue-router'
import HomeView from '../views/HomeView.vue'
import Contact from '../views/ContactView.vue'

const routes = [
  {
    path: '/',
    name: 'home',
    component: HomeView
  },
  {
    path: '/about',
    name: 'about',
    // route level code-splitting
    // this generates a separate chunk (about.[hash].js) for this route
    // which is lazy-loaded when the route is visited.
    component: () => import(/* webpackChunkName: "about" */ '../views/AboutView.vue')
  },
  {
    path:'/contact',
    name: 'Contact',
    component: Contact
  },
  {
    path:'/basic',
    name:'Basic',
    component: ()=> import('../views/BasicView.vue')
  },
  {
    path:"/dataBinding",
    name:"DataBinding",
    component:()=> import('../views/DataBinding.vue')
  },
  {
    path:"/example",
    name:"Example",
    component:()=> import('../views/Example.vue')
  },
  {
    path:'/serverdata',
    name:'serverData',
    component:() => import('../views/ServerData.vue')
  }

]


const router = createRouter({
  history: createWebHashHistory(),
  routes
})

export default router
