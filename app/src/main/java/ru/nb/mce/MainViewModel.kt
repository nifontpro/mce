package ru.nb.mce

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor() : ViewModel() {

	private val _isLoading = MutableStateFlow(true)
	val isLoading = _isLoading.asStateFlow()

	init {
		viewModelScope.launch {
			_isLoading.value = false
		}
	}
}